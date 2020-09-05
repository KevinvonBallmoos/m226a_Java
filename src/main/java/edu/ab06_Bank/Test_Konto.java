package edu.ab06_Bank;

public class Test_Konto {


    public static void main(String[] args) {

        Konto a = new Konto();
        Konto b = new Konto();


        b.einzahlung(720.50);
        b.verzinsen(750);

        System.out.println(b.getSaldo());

        b.einzahlung(300);
        b.verzinsen(750);
        System.out.println(b.getSaldo());


        a.einzahlung(500_001);
        a.einzahlung(750);
        System.out.println(a.getSaldo());
    }
}
