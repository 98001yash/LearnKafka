package com.company.learnKafka.user_service.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MapperConfig {

    @Bean
    public  ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
