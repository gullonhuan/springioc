package com.gullon.demo1;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
//        host.rent();
        //代理，中介帮你处理很多事情
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
