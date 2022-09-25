package com.gullon.demo1;

public class Proxy implements Rent {
    private Host host;

    public Proxy(){

    }
    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
        seeHouse();
        hetong();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你去看房");
    }

    //收中介费
    public void fare(){
        System.out.println("中介收中介费");
    }
    //签合同
    public void hetong(){
        System.out.println("中介带你去签合同");
    }
}
