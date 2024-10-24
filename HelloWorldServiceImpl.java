package com.example.helloworld;

public class HelloWorldServiceImpl implements HelloWorldPortType {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}