package com.gullon.service;

//import com.gullon.dao.UserDaoImpl
//import com.gullon.dao.UserDaoImplmysql;
import com.gullon.dao.UserDao;
import com.gullon.dao.UserDdaoImplorcle;

public class UserServiceImpl implements UserService {
    //private UserDaoImpl userDao = new UserDaoImpl();
    //private UserDaoImplmysql userDao = new UserDaoImplmysql();
    //private UserDdaoImplorcle userDao = new UserDdaoImplorcle();

    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser(){
        userDao.getUser();
    }
}
