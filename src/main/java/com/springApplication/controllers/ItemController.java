package com.springApplication.controllers;

import com.springApplication.bean.ItemBean;
import com.springApplication.bean.ItemCategoryBean;
import com.springApplication.service.ItemCategoryService;
import com.springApplication.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemCategoryService itemCategoryService;

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

    @RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
    public String deleteItem(@RequestBody @PathVariable("id") int id){
        boolean isDeleted = itemService.deleteItem(id);
        String response = "";
        if (isDeleted) {
            response = "Soft Delete Successfully!";
        }
        return response;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}/{category}")
    public String updateItem(@RequestBody @PathVariable("id") int id, @RequestBody @PathVariable("category") int category){
        String response = "";
        ItemBean itemBean = itemService.getItem(id);
        if(itemBean == null){
            response = "Update item is not found";
        }else{
            ItemCategoryBean itemCategoryBean = itemCategoryService.getItemCategory(category);
            if(itemCategoryBean == null){
                response = "Update item category is not found";
            }else{
                boolean isUpdated = itemService.updateItem(id, category);
                if (isUpdated) {
                    response = "Update Successfully!";
                }
            }
        }
        return response;
    }
}
