package app;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberApp {
    public static void main(String[] args) {

        final int constant = 5000;
        Random random = new Random();
        int number;
        number = random.nextInt(9999);

        System.out.println("Wylosowana liczba: " + number);
        if(number < constant) {
            System.out.println(number + " jest mniejsza od " + constant);
        } else if(number == constant) {
            System.out.println(number + " jest równa " + constant);
        } else
        {
            System.out.println(number + " jest większa od " + constant);
        }
        if (number % 2 == 0) {
            System.out.println(number + " jest liczbą parzystą");
        } else
            System.out.println(number + " jest liczbą nieparzystą");
    }

}