package com.gullon.Factory;

import com.gullon.Dao.OrderDao;
import com.gullon.Impl.orderDaoImpl;

public class orderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("在这里嘞");
        return new orderDaoImpl();
        }
}
