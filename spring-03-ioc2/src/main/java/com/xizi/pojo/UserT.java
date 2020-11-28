package com.xizi.pojo;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建了");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserT{" +
                "name='" + name + '\'' +
                '}';
    }
}
