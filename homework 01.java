package assigment01;

import java.util.Scanner;

class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Check if a number is even or odd
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 2. Greeting message based on user input
        System.out.println("Enter a greeting message:");
        scanner.nextLine(); // Consume the newline character
        String greeting = scanner.nextLine();
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(greeting + " " + name + "!");

        // 3. Calculate Simple Interest
        System.out.print("Enter the principal amount: ");
        int principal = scanner.nextInt();
        System.out.print("Enter the rate of interest: ");
        int rate = scanner.nextInt();
        System.out.print("Enter the time in years: ");
        int time = scanner.nextInt();
        int simpleInterest = principal*( 1+ rate * time); // Corrected the formula
        System.out.println("Simple Interest: " + simpleInterest);

        // 4. Calculate based on two numbers and an operator
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                System.exit(0);
            }
        } else {
            System.out.println("Error: Invalid operator");
            System.exit(0);
        }
        System.out.println("Result: " + result);

        // 5. Compare two numbers and print the largest
        System.out.print("Enter the first number: ");
        double number01 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number02 = scanner.nextDouble();

        if (number01 < number02) {
            System.out.println("Number 1 is less than Number 2");
        } else if (number01 > number02) {
            System.out.println("Number 1 is greater than Number 2");
        } else {
            System.out.println("Both numbers are equal");
        }

        // 6. To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter the number of Fibonacci terms to generate: ");
        int nth = scanner.nextInt();
        int a = 0, b = 1, sum;
        System.out.println("Fibonacci Series up to " + nth + " terms:");
        System.out.print(a + " " + b + " "); // Print the first two terms

        for (int i = 2; i < nth; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
        System.out.println(); // Move to the next line after printing the series

        // 7. To find out whether the given String is Palindrome or not.
        System.out.println("Enter your string: ");
        scanner.nextLine(); // Consume the newline character
        String s = scanner.nextLine();
        String rev = "";

        for (int j = s.length() - 1; j >= 0; j--) {
            rev = rev + s.charAt(j); // Corrected the variable index
        }

        if (s.equals(rev)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
