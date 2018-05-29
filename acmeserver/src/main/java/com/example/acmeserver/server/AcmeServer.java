package com.example.acmeserver.server;

/**
 * Hello world!
 */
public class AcmeServer {

    public static void main(String[] args) {
        new AcmeServer().printHelloWorld();
    }

    public void printHelloWorld() {
        System.out.println("hello world from " + getClass().getSimpleName());
    }
}
