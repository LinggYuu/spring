package com.ly.demo1;


//租客
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        //代理房东
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
