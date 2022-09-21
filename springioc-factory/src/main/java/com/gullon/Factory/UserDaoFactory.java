package com.gullon.Factory;

import com.gullon.Dao.UserDao;
import com.gullon.Impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getuserdao(){
        return new UserDaoImpl();
    }
}
