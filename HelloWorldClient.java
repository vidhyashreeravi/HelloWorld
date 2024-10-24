package com.example.helloworld;

public class HelloWorldClient {
    public static void main(String[] args) throws Exception {
        HelloWorldServiceStub stub = new HelloWorldServiceStub("http://localhost:8080/helloWorld");
        HelloWorldPortTypeStub.SayHello sayHello = new HelloWorldPortTypeStub.SayHello();
        sayHello.setName("John");
        HelloWorldPortTypeStub.SayHelloResponse response = stub.sayHello(sayHello);
        System.out.println(response.getGreeting());
    }
}