package com.gullon.jopo;

public class User {
    private String name ;
    private int age;
    private String add;

    private User(){
        System.out.println("user的无参构造");
    }
    private User(String name, int age, String add){
        this.name = name ;
        this.age = age;
        this.add = add ;
        System.out.println("有参构造");
    }

//    private User(int 1)

    public void setAge(int age) {
        name = "ldjflakhfkla";
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
        age = 8888 ;
    }

    public String getName(){
        return name;
    }

    public void showName(){
        System.out.println("hello " + name + "!!!" + "and my age is " + age + ",my address is "+ add);
    }



}
