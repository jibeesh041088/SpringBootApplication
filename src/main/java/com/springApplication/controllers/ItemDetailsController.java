package com.springApplication.controllers;

import com.springApplication.bean.ItemDetailsBean;
import com.springApplication.service.ItemDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequestMapping("/item-details")
public class ItemDetailsController {

    @Autowired
    ItemDetailsService itemDetailsService;

    @RequestMapping(method = RequestMethod.POST, path = "/insert/{item_id}/{language_code}/{name}/{description}/{createdAt}")
    public String createItemDetails(@PathVariable("item_id") int itemId, @PathVariable("language_code") int languageCode, @PathVariable("name") String name, @PathVariable("description") String description, @PathVariable("createdAt") String createdAt){
        Timestamp timestamp = Timestamp.valueOf(createdAt);
        String response = "";
        ItemDetailsBean itemDetailsBean = itemDetailsService.getData(itemId, languageCode);
        if(itemDetailsBean == null){
            boolean isAdded = itemDetailsService.insert(itemId,languageCode, name, description, timestamp);
            if(isAdded){
                response = "Insert Successfully";
            }
        }else{
            response = "Item detail is already exists on itemId and languageCode";
        }

        return response;
    }
}
