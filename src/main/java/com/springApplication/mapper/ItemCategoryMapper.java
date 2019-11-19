package com.springApplication.mapper;

import com.springApplication.bean.ItemCategoryBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemCategoryMapper {

    @Insert("INSERT INTO item_category(name) VALUES (#{name})")
    public int insert(String name);
}
