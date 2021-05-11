package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.config.Task;

@SpringBootApplication
public class DemoApplication {

    private final String task;
    public Tasks (String task){
        this.task = task;
    }

    public String getTask() {
        return task;
    }




    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
