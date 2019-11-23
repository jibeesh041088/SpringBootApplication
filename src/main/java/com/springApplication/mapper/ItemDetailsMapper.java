package com.springApplication.mapper;

import com.springApplication.bean.ItemDetailsBean;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;

@Mapper
public interface ItemDetailsMapper {

    @Insert("INSERT INTO item_details(item_id,language_code,name,description,created_at) VALUES (#{itemId}, #{languageCode}, #{name}, #{description}, #{createdAt})")
    public int insert(@Param("itemId") int itemId, @Param("languageCode") int languageCode, @Param("name") String name, @Param("description") String description, @Param("createdAt") Timestamp createdAt);

    @Select("SELECT * FROM item_details WHERE item_id = #{itemId} AND language_code = #{languageCode}")
    public ItemDetailsBean getData(@Param("itemId") int itemId, @Param("languageCode") int languageCode);
}
