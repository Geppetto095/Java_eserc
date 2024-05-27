package com.casamelo.cmp.demomelo.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class RestExampleController {

    @GetMapping("/getPersona")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return name;
    }
}
