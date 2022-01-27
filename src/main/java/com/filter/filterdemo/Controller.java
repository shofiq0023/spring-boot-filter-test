package com.filter.filterdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/student")
    public String getStudent() {
        return "GetStudent controller was called";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "GetMessage controller was called";
    }
}
