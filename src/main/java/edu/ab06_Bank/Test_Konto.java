package edu.ab06_Bank;

public class Test_Konto {


    public static void main(String[] args) {

        Kunde a = new Kunde("Meier");
        Kunde b = new Kunde("Mayer");


        Konto kA = new Konto(0.01, a.getNachname());
        Konto kB = new Konto(0.01, b.getNachname());

        kA.einzahlen(500.75);
        kA.verzinsen(365);
        System.out.println("Der Kunde" + " " + kA.getInhaber() + " " + "hat ein Konto.");
        System.out.println("Der Saldo des Kontos ist " + " " + kA.getSaldo());


        kB.einzahlen(720.50);
        kB.verzinsen(750);
        System.out.println("Der Kunde" + " " + kA.getInhaber() + " " + "hat ein Konto.");
        System.out.println("Der Saldo des Kontos ist " + " " + kB.getSaldo());

        kB.einzahlen(450);
        kB.verzinsen(250);
        System.out.println("Der Saldo des Kontos ist " + " " + kB.getSaldo());

    }
}
