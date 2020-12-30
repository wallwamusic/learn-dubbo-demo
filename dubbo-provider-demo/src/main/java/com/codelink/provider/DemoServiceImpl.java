package com.codelink.provider;

import com.codelink.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("RPC远程DemoServer被调用了!!!");
        return "Hello " + name;
    }
}
