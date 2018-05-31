package com.example.acmeserver.server;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public class AcmeServer {

    private static final Logger LOGGER = Logger.getLogger(AcmeServer.class.getName());

    public static void main(String[] args) {
        new AcmeServer().printHelloWorld();
    }

    public void printHelloWorld() {
        System.out.println("hello world from " + getClass().getSimpleName());
    }
}
