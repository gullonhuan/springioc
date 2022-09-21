package com.gullon.Impl;

import com.gullon.Dao.OrderDao;

public class orderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao save...");
    }
}
