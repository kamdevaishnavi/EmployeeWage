package com.brizz.usecase;

public class EmployeeWage {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Welcome to Employee Wage Computation Program");
        final int WAGE_PER_HR = 20;
        final int FULL_DAY = 8;
        final int PARTTIME = 4;
        int pay = 0;
        int num = (int) Math.floor((Math.random() * 10)) % 3;
        System.out.println(num);
        switch (num) {
            case 1: {
                System.out.println("Employee is Present ");
                pay = WAGE_PER_HR * FULL_DAY;
            }
               break;
            case 2: {
                System.out.println("Employee is Part-Time");
                pay = WAGE_PER_HR * PARTTIME;
            }
              break;
            case 0: {
                System.out.println("Employee is Absent ");
            }
        }
        System.out.println("Employee Daily Wage " + pay);

    }
}
