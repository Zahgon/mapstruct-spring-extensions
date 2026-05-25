package org.mapstruct.extensions.spring.example.boot;

import org.mapstruct.extensions.spring.example.Car;
import org.mapstruct.extensions.spring.example.CarDto;
import org.mapstruct.extensions.spring.example.SeatConfiguration;
import org.mapstruct.extensions.spring.example.SeatMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static final Logger log = LoggerFactory.getLogger(Start.class);

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx, ConversionServiceAdapter adapter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
