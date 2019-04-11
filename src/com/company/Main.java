package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        minMaxChallenge();


    }

    public static void minMaxChallenge() {

        Scanner scanner = new Scanner(System.in);

        int lowNumber = 0;
        int highNumber = 0;
        int number;
        int count = 1;
        boolean hasNextInt;

        do {
            System.out.println("Enter number #" + count + ": ");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                number = scanner.nextInt();
                scanner.nextLine();

                if (number < 0) {
                    System.out.println("Invalid number");
                    System.out.println("Computing results...");
                    System.out.println("The high number is: " + highNumber);
                    System.out.println("The low number is: " + lowNumber);
                    System.out.println("Exiting program");
                    scanner.close();
                    return;
                }
                if (count == 1) {
                    lowNumber = number;
                    highNumber = number;
                } else {
                    if (number < lowNumber)
                        lowNumber = number;
                    if (number > highNumber)
                        highNumber = number;
                }
            } else {
                System.out.println("Error: No next int.");
                System.out.println("Exiting program without computing results");
                scanner.close();
                return;
            }
            count++;
        } while (true);

    }
}
