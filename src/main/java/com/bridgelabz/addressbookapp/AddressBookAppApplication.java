package com.bridgelabz.addressbookapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);
        log.info("Address Book Application Started in {} Environment", context.getEnvironment().getProperty("environment"));
        log.info("Address Book DB User is {}", context.getEnvironment().getProperty("spring.datasource.username"));
    }
   @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
   }
}
