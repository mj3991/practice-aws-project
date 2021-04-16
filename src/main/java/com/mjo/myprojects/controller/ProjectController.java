package com.mjo.myprojects.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProjectController {

    @GetMapping("/getMessage")
    public String getMessage(@RequestParam (required = true) String name){
        return "Sample Application : " + name;
    }
}
