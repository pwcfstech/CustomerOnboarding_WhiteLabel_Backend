package com.afrAsia.service.impl;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.afrAsia.dao.jpa.UserJpaDAO;
import com.afrAsia.service.UserService;

public class Test
{

    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:**/*applicationContext-services.xml");
        
        
        UserService userService = context.getBean("userService", UserService.class);
//        userService.saveUser("Nyal Fernandes");
        System.out.println(userService.fetchUsers());
        
    }
}
