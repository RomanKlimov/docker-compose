package com.itis.dockerappboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.itis.dockerappboot.config", "com.itis.dockerappboot.domain",
        "com.itis.dockerappboot.receivers", "com.itis.dockerappboot.services"})
@EnableJpaRepositories(basePackages = {"com.itis.dockerappboot.repositories"})
@EntityScan(basePackages = {"com.itis.dockerappboot.domain"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
