package com.springApplication.mapper;

import com.springApplication.bean.ItemBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;

@Mapper
public interface ItemMapper {

    @Insert("INSERT INTO item(category,length,width,height,weight,created_at) VALUES (#{category}, #{length}, #{width}, #{height}, #{weight}, #{createdAt})")
    public int insert(@Param("category") int category, @Param("length") float length, @Param("width") float width, @Param("height") float height, @Param("weight") float weight, @Param("createdAt") Timestamp createdAt);

}
