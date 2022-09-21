package com.gullon.App;

import com.gullon.Dao.OrderDao;
import com.gullon.Factory.orderDaoFactory;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        OrderDao orderDao = orderDaoFactory.getOrderDao();
        orderDao.save();
    }
}
