package com.springApplication.service;

import com.springApplication.bean.ItemDetailsBean;
import com.springApplication.mapper.ItemDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Service
@Transactional
public class ItemDetailsService {

    @Autowired
    ItemDetailsMapper itemDetailsMapper;

    public boolean insert(int itemId, int languageCode, String name, String description, Timestamp createdAt){
         boolean isAdded = itemDetailsMapper.insert(itemId, languageCode, name, description, createdAt) > 0;
        return isAdded;
    }

    public ItemDetailsBean getData(int itemId, int languageCode){
        ItemDetailsBean itemDetailsBean = itemDetailsMapper.getData(itemId, languageCode);
        return itemDetailsBean;
    }
}
