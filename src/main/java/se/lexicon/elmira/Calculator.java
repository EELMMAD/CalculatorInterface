package se.lexicon.elmira;

import java.util.Scanner;

public interface Calculator {
    public abstract double addition(double num1, double num2);
    public abstract double subtraction(double num1, double num2);
    public abstract double multiplication(double num1, double num2);
    public abstract double division(double num1, double num2);

    public static Scanner SCANNER = new Scanner(System.in);

    public static String getStringFromUser(){
        return SCANNER.nextLine();
    }

    public static double getNumber(){
        boolean valid = false;
        double number = 0;
        while (!valid){
            try {
                number = Double.parseDouble(getStringFromUser().trim().replace(",", "."));
                valid = true;
            }catch (NumberFormatException e){
                System.out.println("Wrong input");
            }
        }
        return number;
    }

    public default double calculate (double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = addition(num1, num2);
                break;

            case '-':
                result = subtraction(num1, num2);
                break;

            case '*':
                result = multiplication(num1, num2);
                break;

            case '/':
                result = division(num1, num2);
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
        }
        return result;
    }
}