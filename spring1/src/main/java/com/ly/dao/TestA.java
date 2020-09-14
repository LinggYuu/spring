package com.ly.dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
        TestB Testb;

    public void setTestB(TestB testB) {
        this.Testb=testB;
    }
    public void getTestB(){
        Testb.print();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestA tsta = (TestA) context.getBean("TestA");
        tsta.getTestB();
    }
}
