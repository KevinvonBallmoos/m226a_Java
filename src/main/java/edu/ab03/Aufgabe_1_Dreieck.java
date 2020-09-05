package edu.ab03;

public class Aufgabe_1_Dreieck {


    public static int Linie = 5;

    public static void main(String[] args) {

        //Prints a triangle of stars on the left
        StringBuilder star = new StringBuilder();
        for (int i = 0; i <= Linie; i++) {

            System.out.println(star.append(" *"));
        }


        System.out.println("");

        //Prints a triangle of stars centered
        StringBuilder starb = new StringBuilder();
        for (int j = 0; j < Linie; j++) {

            System.out.printf("%" + (Linie - j) + "s", " ");
            System.out.println(starb.append(" *"));

        }

    }
}

