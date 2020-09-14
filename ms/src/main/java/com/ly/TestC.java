package com.ly;

import com.ly.mapper.Mapper;
import com.ly.pojo.Member;
import com.ly.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC {
    @Test
    public void zeng() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Mapper mapper = context.getBean("mapper2", Mapper.class);
        mapper.insertMember(new Member("1d21","dd","home"));

    }
}
