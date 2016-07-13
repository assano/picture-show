package com.wangyang.model;

import java.io.Serializable;

/**
 * Created by wy on 2016/7/13.
 */
public class Person implements Serializable {
    private String name;
    private String hobby;

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
