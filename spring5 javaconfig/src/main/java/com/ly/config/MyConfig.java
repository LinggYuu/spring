package com.ly.config;

import com.ly.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;


//@Bean是直接返回自己new的对象，所以不用加@Component也能获得

//@Configuration这个也会被注入到容器中
//@Configuration代表这是一个配置类，就和beans.xml是一样的

@Configuration  //变成了beans.xml

//@ComponentScan("com.ly.pojo")相当于之前扫描组件
@ComponentScan("com.ly.pojo")

@Import(MyConfig2.class)

public class MyConfig {
    //如果完全用了配置类方式去做，
    // 只能通过AnnotationConfig上下问来获取容器，通过配置类的class对象加载
    @Bean//相当于我们之前的<bean></bean> id是这个方法的名字，返回值相当于class属性
    public User user(){
        return new User();//就是返回要注入到bean的对象
    }
}
