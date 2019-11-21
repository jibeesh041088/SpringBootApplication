package com.springApplication.mapper;

import com.springApplication.bean.ItemBean;
import com.springApplication.bean.ItemCategoryBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemCategoryMapper {

    @Insert("INSERT INTO item_category(name) VALUES (#{name})")
    public int insert(String name);

    @Select("SELECT * FROM item_category where id = #{category}")
    public ItemCategoryBean getItemCategory(@Param("category") int category);
}
