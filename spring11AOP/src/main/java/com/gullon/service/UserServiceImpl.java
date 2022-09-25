package com.gullon.service;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加一个用户");
    }
    @Override
    public void del() {
        System.out.println("删除一个用户");
    }
    @Override
    public void update() {
        System.out.println("更新一个用户");
    }
    @Override
    public void select() {
        System.out.println("查询了一个用户");
    }
}
