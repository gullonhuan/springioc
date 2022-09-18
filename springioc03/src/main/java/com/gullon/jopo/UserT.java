package com.gullon.jopo;

public class UserT {
    private String name;

    public void UserT(){
        System.out.println("UserT被无参创建了");
    }
    public void show(){
        System.out.println("name=" + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
