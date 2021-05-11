package com.example.demo;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class TaskController {
    private List<Task> tasks;
    public TaskController() {
        tasks = List.of(
                new Task ("Water the plants"),
                new Task( "Do some Codeacademy exercises"),
                new Task( "Read SprigBoot article"),
                new Task( "Create repository")
               );

    }

    @GetMapping("/tasks")
    public List<Task> allTask() {
        return tasks;
    }



}
