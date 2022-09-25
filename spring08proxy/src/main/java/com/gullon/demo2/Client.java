package com.gullon.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        UserServiceImpl userService = new UserServiceImpl();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
