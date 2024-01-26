package com.mjv.curso.service;

import java.util.Scanner;

public class CalculatorService {

    private Scanner sc = new Scanner(System.in);


    public Double sum() {
        System.out.println("Enter the first number: ");
        double numberOne = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double numberTwo = sc.nextDouble();

        return numberOne + numberTwo;
    }

    public Double subtraction() {
        System.out.println("Enter the first number: ");
        double numberOne = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double numberTwo = sc.nextDouble();

        return numberOne - numberTwo;
    }

    public Double multiplication() {
        System.out.println("Enter the first number: ");
        double numberOne = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double numberTwo = sc.nextDouble();

        return numberOne * numberTwo;
    }

    public Double division() {
        System.out.println("Enter the first number: ");
        double numberOne = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double numberTwo = sc.nextDouble();

        if (!(numberTwo != 0)){
            System.out.println("Can't be divided by 0");

        }
        return numberOne / numberTwo;
    }

    public double oddOrEvenNumber() {
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }
        return number;
    }

}
