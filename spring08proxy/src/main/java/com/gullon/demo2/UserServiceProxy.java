package com.gullon.demo2;

public class UserServiceProxy {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add (){
        System.out.println("进行了增加操作");
        userService.add();
    }
}
