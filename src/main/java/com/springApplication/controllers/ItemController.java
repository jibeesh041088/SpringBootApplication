package com.springApplication.controllers;

import com.springApplication.bean.ItemBean;
import com.springApplication.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    @ResponseBody
    public ItemBean getItem(@RequestBody @PathVariable("id") int id){
        ItemBean itemBean = itemService.getItem(id);
        return itemBean;
    }
}
