package com.example.greetingapp.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "{ \"message\": \"Hello World\" }";
    }

    @PostMapping
    public String createGreeting(@RequestBody Map<String, String> payload) {
        return "{ \"message\": \"Greeting Created: " + payload.get("message") + "\" }";
    }

    @PutMapping
    public String updateGreeting(@RequestBody Map<String, String> payload) {
        return "{ \"message\": \"Greeting Updated: " + payload.get("message") + "\" }";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{ \"message\": \"Greeting Deleted\" }";
    }
}