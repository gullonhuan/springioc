package com.gullon.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {
    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }


    public Cat getCat() {
        return cat;
    }



    public String getName() {
        return name;
    }

}
