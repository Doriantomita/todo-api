package com.dorian.todoapi.controller;

import com.dorian.todoapi.controller.dto.AuthenticationDto;
import com.dorian.todoapi.controller.dto.LoggedResponseDto;
import com.dorian.todoapi.facade.UserFacade;
import com.dorian.todoapi.security.JwtTokenUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/authentication")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;
    private final UserFacade userFacade;

    @PostMapping(value = "/login")
    public ResponseEntity<LoggedResponseDto> login(@RequestBody @Valid AuthenticationDto authenticationDto) {
        userFacade.checkCredentials(authenticationDto);
        Authentication authentication = authenticationManager.authenticate
                (new UsernamePasswordAuthenticationToken(authenticationDto.getUsername(), authenticationDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenUtil.generateToken(authentication);
        return new ResponseEntity<>(new LoggedResponseDto(authentication.getName(), token), HttpStatus.OK);
    }

}
