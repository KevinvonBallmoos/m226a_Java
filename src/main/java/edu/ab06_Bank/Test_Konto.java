package edu.ab06_Bank;

public class Test_Konto {


    public static void main(String[] args) {

        Konto kA = new Konto();
        Konto kB = new Konto();

        kA.einzahlen(500.75);
        kA.verzinsen(365);
        System.out.println(kA.getSaldo());


        kB.einzahlen(720.50);
        kB.verzinsen(750);
        System.out.println(kB.getSaldo());

        kB.einzahlen(450);
        kB.verzinsen(250);
        System.out.println(kB.getSaldo());
    }
}
