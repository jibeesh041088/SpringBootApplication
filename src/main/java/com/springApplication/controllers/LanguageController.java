package com.springApplication.controllers;

import com.springApplication.bean.LanguageBean;
import com.springApplication.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    LanguageService languageService;

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Hello Rest Api!";
    }

    @RequestMapping(method = RequestMethod.PUT,path= "/insert")
    public String createLanguage(){
        boolean isAdded = languageService.insert();
        String response = "";
        if (isAdded) {
            response = "Inserted Successfully!";
        }
        return response;
    }
}
