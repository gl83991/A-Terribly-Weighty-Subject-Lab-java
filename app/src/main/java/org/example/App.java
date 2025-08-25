package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Converter App!");
    // You can create instances of Converter and call its methods here
    // to demonstrate its functionality.
    System.out.println("How many ounces do you have? ");
    Scanner scanner = new Scanner(System.in);
    int ounces = scanner.nextInt();
    
    
    Converter converter = new Converter();

    System.out.println("Thank you! Converting ounces to pounds...");
    System.out.println();
    System.out.printf("%d oz is equal to %s.%n", ounces, converter.toPounds(ounces));
    System.out.printf("%d oz is equal to %s.%n", ounces, converter.toPoundsAndOunces(ounces));
    System.out.println();
    System.out.println("Thank you and goodbye!");

    scanner.close();
  }
}
