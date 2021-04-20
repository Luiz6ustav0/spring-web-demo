package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student luiz = new Student(
                    "Luiz",
                    "luizorst@hotmail.com",
                    LocalDate.of(2000, AUGUST, 30)
            );
            Student maria = new Student(
                    "Maria",
                    "maria@hotmail.com",
                    LocalDate.of(2001, AUGUST, 30)
            );

            repository.saveAll(List.of(luiz, maria));
        };
    }
}
