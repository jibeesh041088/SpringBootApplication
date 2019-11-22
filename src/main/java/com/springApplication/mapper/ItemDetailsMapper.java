package com.springApplication.mapper;

import com.springApplication.bean.ItemDetailsBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;

@Mapper
public interface ItemDetailsMapper {

    @Insert("INSERT INTO item_details(item_id,language_code,name,description,created_at) VALUES (#{itemId}, #{languageCode}, #{name}, #{description}, #{createdAt})")
    public int insert(@Param("itemId") int itemId, @Param("languageCode") int languageCode, @Param("name") String name, @Param("description") String description, @Param("createdAt") Timestamp createdAt);

}
