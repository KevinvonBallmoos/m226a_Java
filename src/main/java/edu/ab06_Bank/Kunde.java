package edu.ab06_Bank;

public class Kunde {

    private String nachname;
    private String vorname;
    private int Kundennummer;

    public Kunde(String nachname){
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }
}
