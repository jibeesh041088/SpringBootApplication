package com.springApplication.service;

import com.springApplication.bean.ItemBean;
import com.springApplication.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Service
@Transactional
public class ItemService {

    @Autowired
    ItemMapper itemMapper;

    public boolean insert(int category, float length, float width, float height, float weight, String createdAt){
        ItemBean itemBean = new ItemBean();

        Timestamp timestamp = Timestamp.valueOf(createdAt);

        boolean isAdded = itemMapper.insert(category,length, width, height, weight, timestamp) > 0;
        return isAdded;
    }
}