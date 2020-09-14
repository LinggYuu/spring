package com.ly.demo2;

public class UserServiceImpl implements UserService{


    public void add() {
        System.out.println("增了个用户");
    }

    public void delete() {
        System.out.println("删了个用户");
    }

    public void update() {
        System.out.println("改了个用户");
    }

    public void query() {
        System.out.println("查了个用户");
    }
}
