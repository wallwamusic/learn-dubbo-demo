package com.codelink;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.out.println("dubbo远程服务端启动了....");
        System.in.read(); // 按任意键退出
    }
}
