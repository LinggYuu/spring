package com.ly.demo1;


//代理角色
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        seeHouse();
        this.host = host;
        hetong();
        fare();
    }
    public void rent(){
        host.rent();
    }

    public void seeHouse(){
        System.out.println("中介带看房");
    }
    public void fare(){
        System.out.println("收中介费");
    }
    public void hetong(){
        System.out.println("签合同");
    }
}
