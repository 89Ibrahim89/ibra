package com.company;

import java.util.Random;

public class Main {
    // Домашка 2 урок
    public static void main(String[] args) {
    int age = 40;
    int temp = 28;
    if (temp > 30 || age < 45){
            System.out.println("Можно идти гулять");
        }
        
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int randomAge = random.nextInt(50);

        return randomAge;

    }

}

