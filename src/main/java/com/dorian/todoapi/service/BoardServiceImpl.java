package com.dorian.todoapi.service;

import com.dorian.todoapi.persistence.repository.BoardRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private BoardRepository boardRepository;
}
