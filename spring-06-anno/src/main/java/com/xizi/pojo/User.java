package com.xizi.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//等价于<bean id="user" class="com.xizi.pojo.User"/>
@Component
@Scope("prototype")
public class User {
    @Value("xizi")
    public String name;
}
