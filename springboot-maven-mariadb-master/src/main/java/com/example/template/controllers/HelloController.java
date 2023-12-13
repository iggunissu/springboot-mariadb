package com.example.template.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.template.models.MyTemplate;
import com.example.template.services.MyTemplateService;

@RestController
public class HelloController {

    private final MyTemplateService myTemplateService;

    @Autowired
    public HelloController(MyTemplateService myTemplateService) {
        this.myTemplateService = myTemplateService;
    }

    @GetMapping("/")
    public String hello() {
        List<MyTemplate> myTemplates = myTemplateService.findAll();

        String message = "Hello World<br>";
        for (MyTemplate temp : myTemplates) {
            message += String.format("id: %s, name: %s<br>", temp.getId(), temp.getName());
        }

        return message;
    }
}
