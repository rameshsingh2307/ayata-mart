package com.ayata.ayatamart.authentication;

import java.util.Random;

public class RandomToken {
    public String generatedToken() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        //System.out.println(generatedString);

        return generatedString;
    }
}