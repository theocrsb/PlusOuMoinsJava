package com.training;

import java.util.Random;

public class RandomNumber {

    public int randomNumber() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high - low) + low;
        // System.out.println(result + " random number after generate");
        return result;
    }

}
