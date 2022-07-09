package com.xy.spring5.testDemo;

import com.xy.spring5.Book;
import com.xy.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean(){
        //1.加载spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();


    }

}
