package edu.pi;

public class Calculate_Pi {

    public double calculate(double piSquared, double numerator, double denominator) {

        for (int i = 1; i < 1000; i++) {

            piSquared = piSquared + (numerator / denominator);
            numerator = -numerator;
            denominator += 2;
        }
        return piSquared * 4;
    }
}