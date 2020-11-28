package com.xizi.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {
    //说明这个对象可以为null
//    @Autowired(required = false)
//    @Qualifier(value = "cat22")
    @Resource(name = "cat11")
    private Cat cat;
//    @Autowired
//    @Qualifier(value = "dog11")
    @Resource
    private Dog dog;
    private String name;



    public Cat getCat() {
        return cat;
    }


    public Dog getDog() {
        return dog;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
