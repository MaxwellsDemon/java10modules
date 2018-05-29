package com.example.acmeclient.client;

import com.example.acmeserver.secretutil.CryptoCyberBlockchain;
import com.example.acmeserver.server.AcmeServer;

public class AcmeClient {

    public static void main(String[] args) {
        System.out.println(AcmeServer.class);
        // This dependency on a class in the secretutil package should be disallowed by acmeserver Java module
        System.out.println(CryptoCyberBlockchain.class);
        new AcmeServer().printHelloWorld();
    }
}