package com.mjv.curso.util;

import com.mjv.curso.model.User;
import com.mjv.curso.service.CalculatorService;

import java.util.Scanner;

public class UtilCalculator {

    private final CalculatorService calculatorService = new CalculatorService();

    private final Scanner sc = new Scanner(System.in);


    public void form(User user){

        System.out.println("Hello, welcome to the oop calculator, please fill in the form.");

        System.out.println("\nEnter your first name. ");
        user.setFirstName(sc.next());

        System.out.println("Enter your second name. ");
        user.setSecondName(sc.next());

        System.out.println("Enter your profession. ");
        user.setProfession(sc.next());

        System.out.println("Enter your age. ");
        user.setAge(sc.nextInt());

        System.out.println("------------------------------------");

        String fullName = user.getFirstName() + " " + user.getSecondName();
        System.out.println("Name: " + fullName);

        System.out.println("Profession: " + user.getProfession());

        System.out.println("Age: " + user.getAge());

        System.out.println("------------------------------------");

        System.out.println("\n ");

        calculatorMachine(user);

    }

    private void calculatorMachine(User user){
        System.out.print("Hello " + user.getFirstName() + " Choose your math account: " +
                "\n [1] to Sum" +
                "\n [2] to Subtraction" +
                "\n [3] to Multiplication" +
                "\n [4] to Division" +
                "\n [5] to See if your number is odd or even" +
                "\n [0] to Out \n");
        int operation = sc.nextInt();
        switch (operation){
            case 1:
                System.out.printf("Your result is: %.2f", calculatorService.sum());
                break;
            case 2:
                System.out.printf("Your result is: %.2f", calculatorService.subtraction());
                break;
            case 3:
                System.out.printf("Your result is: %.2f", calculatorService.multiplication());
                break;
            case 4:
                System.out.printf("Your result is: %.2f", calculatorService.division());
                break;
            case 5:
                System.out.printf(String.valueOf(calculatorService.oddOrEvenNumber()));
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid operation");
        }

    }

}

