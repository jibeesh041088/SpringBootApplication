package com.springApplication.service;

import com.springApplication.bean.ItemCategoryBean;
import com.springApplication.mapper.ItemCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemCategoryService {

    @Autowired
    ItemCategoryMapper itemCategoryMapper;

    public boolean insert(String name){
        ItemCategoryBean itemCategoryBean = new ItemCategoryBean();
        itemCategoryBean.name = "TEST01";

        boolean isAdded = itemCategoryMapper.insert(name) > 0;
        return isAdded;
    }

    public ItemCategoryBean getItemCategory(int category){
        ItemCategoryBean itemCategoryBean = itemCategoryMapper.getItemCategory(category);
        return itemCategoryBean;
    }
}
