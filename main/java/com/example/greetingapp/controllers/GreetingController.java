package com.example.greetingapp.controllers;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.services.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingService.saveGreeting(greeting.getMessage());
    }

    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
}