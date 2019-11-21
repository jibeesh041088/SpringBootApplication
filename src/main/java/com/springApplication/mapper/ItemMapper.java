package com.springApplication.mapper;

import com.springApplication.bean.ItemBean;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;

@Mapper
public interface ItemMapper {

    @Insert("INSERT INTO item(category,length,width,height,weight,created_at) VALUES (#{category}, #{length}, #{width}, #{height}, #{weight}, #{createdAt})")
    public int insert(@Param("category") int category, @Param("length") float length, @Param("width") float width, @Param("height") float height, @Param("weight") float weight, @Param("createdAt") Timestamp createdAt);

    @Select("SELECT * FROM item where id = #{id}")
    public ItemBean getItem(@Param("id") int id);

    @Update("UPDATE item SET is_deleted = true WHERE id = #{id}")
    public int deleteItem(@Param("id") int id);

    @Update("UPDATE item SET category = #{category} WHERE id = #{id}")
    public int updateItem(@Param("id") int id, @Param("category") int category);
}
