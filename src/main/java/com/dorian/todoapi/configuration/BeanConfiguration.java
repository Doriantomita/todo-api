package com.dorian.todoapi.configuration;

import com.dorian.todoapi.aspect.Logging;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfiguration {

    @Bean
    @Scope(scopeName = "prototype")
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public Logging logging() {
        return new Logging();
    }
}
