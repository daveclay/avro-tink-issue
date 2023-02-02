package com.mycompany.app;

import com.google.crypto.tink.daead.DeterministicAeadConfig;

import java.security.GeneralSecurityException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws GeneralSecurityException {
        DeterministicAeadConfig.register();
        System.out.println( "Hello World!" );
    }
}
