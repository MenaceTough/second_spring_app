package com.toxicapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String startPassword = "1234";
        String encodedPassword = encoder.encode(startPassword);

        System.out.println(encodedPassword);
    }

}