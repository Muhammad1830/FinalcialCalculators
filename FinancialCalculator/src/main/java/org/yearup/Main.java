package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter loan term (in years): ");

        int loanTermYears = scanner.nextInt();
        int loanTermMonths = loanTermYears * 12;

        double monthlyInterestRate = interestRate / (12 *100);
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));


        System.out.printf("Your monthly mortgage payment is: $%.2f", monthlyPayment);
        System.out.println();
        System.out.printf("Your total interest is: $%.2f", (((monthlyPayment * 12) * loanTermYears) - loanAmount));


    }
}