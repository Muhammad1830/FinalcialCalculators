package org.yearup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the deposit amount: ");
        double deposit = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years to invest: ");
        int years = scanner.nextInt();

        double futureValue = deposit * Math.pow(1 + interestRate, years);

        System.out.printf("The future value of your deposit: $%.2f", futureValue);
        System.out.println();
        System.out.printf("You have earned in interest: $%.2f", (futureValue - deposit));

    }

}