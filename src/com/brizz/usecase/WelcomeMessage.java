package com.brizz.usecase;

public class WelcomeMessage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        int isPresent = 1;
        if (empCheck == isPresent)
            System.out.println("Employee is present");

        else {

            System.out.println("Employee is absent");
        }
    }
}
