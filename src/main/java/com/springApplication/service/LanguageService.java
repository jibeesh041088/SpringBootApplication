package com.springApplication.service;

import com.springApplication.bean.LanguageBean;
import com.springApplication.mapper.LanguageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LanguageService {

    @Autowired
    LanguageMapper languageMapper;


    public boolean insert(){
        LanguageBean language = new LanguageBean();
        language.languageCode = "en";
        language.language = "English";


        boolean isAdded = languageMapper.insert(language) > 0;
        return isAdded;
    }
}
