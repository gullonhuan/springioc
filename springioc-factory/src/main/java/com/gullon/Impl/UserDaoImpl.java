package com.gullon.Impl;

import com.gullon.Dao.UserDao;

public class UserDaoImpl implements UserDao {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println("I am coming.....");
    }

    public void init(){
        System.out.println("init....");
    }

    public void destory(){
        System.out.println("destory...");
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
