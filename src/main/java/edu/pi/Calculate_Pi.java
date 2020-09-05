package edu.pi;

public class Calculate_Pi {

    public static double piSquared = 0;
    public static double numerator = 1;
    public static double denominator = 1;

    public static void main(String[] args) {


        System.out.println(calculate() * 4);
    }


    public static double calculate() {

        for (int i = 1; i < 1000; i++) {

            piSquared = piSquared + (numerator / denominator);
            numerator = -numerator;
            denominator += 2;
        }
        return piSquared;
    }
}