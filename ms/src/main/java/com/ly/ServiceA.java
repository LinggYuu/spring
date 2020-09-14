//package com.ly;
//
//import com.ly.mapper.Mapper;
//import com.ly.pojo.User;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class ServiceA {
//    @Test
//    public void zeng() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        Mapper mapper = context.getBean("mapper2", Mapper.class);
//        mapper.insertUser(new User("121","dd","fff"));
//        System.out.println("增结束");
//    }
//    @Test
//    public void shan(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        Mapper mapper = context.getBean("mapper2", Mapper.class);
//        mapper.delUser(121);
//        System.out.println("删结束");
//    }
//    @Test
//    public void gai(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        Mapper mapper = context.getBean("mapper2", Mapper.class);
//        mapper.updateUser(new User("101","lll","777888999"));
//        System.out.println("改结束");
//    }
//    @Test
//    public void cha(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        Mapper mapper = context.getBean("mapper2", Mapper.class);
//        for (User user : mapper.selectUser()) {
//                System.out.println(user);
//        }
//    }
//}
