package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum = calculator.add(10, 2);
        System.out.println("suma" + sum);
        int difference = calculator.subtract(10, 2);
        System.out.println("różnica" + difference);

    }
}

