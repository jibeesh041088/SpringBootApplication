package com.springApplication.bean;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

public class ItemDetailsBean {

    @Getter
    @Setter
    public int id;

    @Getter
    @Setter
    public int itemId;

    @Getter
    @Setter
    public int languageCode;

    @Getter
    @Setter
    public String name;

    @Getter
    @Setter
    public String description;

    @Getter
    @Setter
    public Timestamp createdAt;

    @Getter
    @Setter
    public Timestamp updatedAt;
}
