package com.springApplication.controllers;

import com.springApplication.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Hello Rest Api!";
    }

    @RequestMapping(method = RequestMethod.POST,path= "/insert")
    public String createItem(@RequestParam int category, @RequestParam float length, @RequestParam float width, @RequestParam float height, @RequestParam float weight, @RequestParam String createdAt){
        boolean isAdded = itemService.insert(category, length, width, height, weight, createdAt);
        String response = "";
        if (isAdded) {
            response = "Inserted Successfully!";
        }
        return response;
    }
}
