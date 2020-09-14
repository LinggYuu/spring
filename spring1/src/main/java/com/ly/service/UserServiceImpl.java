package com.ly.service;

import com.ly.dao.UserDao;
import com.ly.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{


//老模式  声明一个父用子类new，并调用方法  每次客户需求一改，例如用userdaomysql了，就要这边重新new
//    private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        //this.userDao是 上面的private userDao userdao
        // = 的userDao是形参
        //this为了区分
    }

    public void getUser(){
        userDao.getUser();
    }
}
