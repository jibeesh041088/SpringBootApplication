package com.springApplication.mapper;

import com.springApplication.bean.LanguageBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LanguageMapper {

    @Insert("INSERT INTO Language(language_code,language) VALUES (#{languageCode}, #{language})")
    public int insert(LanguageBean language);
}
