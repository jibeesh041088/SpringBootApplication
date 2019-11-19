package com.springApplication.controllers;

import com.springApplication.service.ItemCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item_category")
public class ItemCategoryController {

    @Autowired
    ItemCategoryService itemCategoryService;

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Hello Rest Api!";
    }

    @RequestMapping(method = RequestMethod.POST,path= "/insert")
    public String createItemCategory(@RequestParam String name){
        boolean isAdded = itemCategoryService.insert(name);
        String response = "";
        if (isAdded) {
            response = "Inserted Successfully!";
        }
        return response;
    }
}
