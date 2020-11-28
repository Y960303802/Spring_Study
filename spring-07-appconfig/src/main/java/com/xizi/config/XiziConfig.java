package com.xizi.config;

import com.xizi.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //相当于beans.xml
@ComponentScan("com.xizi") //扫描注解
@Import(xiziconfig2.class)  //使用@Import导入的类会被Spring加载到IOC容器中
public class XiziConfig {


    @Bean //相当于bean标签
//    方法名字相当于bean标签中的id属性
//    方法返回值相当于bean标签中的class属性
    public User getuser(){
        return new User();
    }

}
