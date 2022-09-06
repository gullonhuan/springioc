package com.gullon.jopo;

public class User {
    private String name ;

    private User(){
        System.out.println("user的无参构造");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void showName(){
        System.out.println("hello " + name + "!!!");
    }

}
