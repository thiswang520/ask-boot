package com.ask.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*")
public class TestController {
    @PostMapping("/login")
    public String examine(){
        System.out.print("1111111");
        return "123";
    }

}
