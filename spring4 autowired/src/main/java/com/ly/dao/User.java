package com.ly.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component   //组件  等价于    <bean id="user" class="com.ly.dao.User"/>
public class User {

    @Value("ling") //相当于<property name="name" value="ling"/>
    //复杂的还是用配置文件好
    //@Value也能注入在set上
    public String name;
}
