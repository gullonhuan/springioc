package com.gullon.demo2;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个客户");
    }

    @Override
    public void ded() {
        System.out.println("删除了一个客户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个客户");
    }

    @Override
    public void updata() {
        System.out.println("更新了一个客户");
    }
}
