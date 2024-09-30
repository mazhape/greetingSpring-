package com.example.greetingSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "") String name, @RequestParam(value = "gender") String gender){
        if(gender.equalsIgnoreCase("male")){
            return String.format("Hello Mr %s!", name );
        }else if (gender.equalsIgnoreCase("female")){
            return String.format("Hello Miss %s!", name);
        }else {
            return String.format("Hello %s!", name);
        }
    }
}