package com.springApplication.bean;

import lombok.Getter;
import lombok.Setter;

public class ItemBean {

    @Getter
    @Setter
    public int id;

    @Getter
    @Setter
    public int category;

    @Getter
    @Setter
    public float length;

    @Getter
    @Setter
    public float width;

    @Getter
    @Setter
    public float height;

    @Getter
    @Setter
    public float weight;

    @Getter
    @Setter
    public String createdAt;

    @Getter
    @Setter
    public String updatedAt;

    @Getter
    @Setter
    public boolean isDeleted;
}
