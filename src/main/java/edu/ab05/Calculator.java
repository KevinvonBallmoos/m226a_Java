package edu.ab05;

import edu.pi.Calculate_Pi;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        for (int i = 1; i < 7; i++){
            System.out.println(calculator.calc(50, 15, i));
        }
    }

    public int calc(int operand1, int operand2, int operator) {

        return switch (operator) {
            case 1 -> operand1 + operand2;
            case 2 -> operand1 - operand2;
            case 3 -> operand1 * operand2;
            case 4 -> operand1 / operand2;
            case 5 -> operand1 % operand2;
            default -> throw new IllegalStateException("Ungültiger Operator");
        };
    }
}