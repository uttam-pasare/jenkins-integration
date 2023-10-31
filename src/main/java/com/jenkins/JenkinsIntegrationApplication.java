package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsIntegrationApplication {

    public static void main(String[] args) {
        System.out.println("----------- Application Started --------");
        SpringApplication.run(JenkinsIntegrationApplication.class, args);
    }

}
