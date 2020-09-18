package edu.ab06_Bank;

public class Konto {

    private double saldo;
    private double zinsSatz;
    private String inhaber;

    public Konto(double zinsSatz, String inhaber){
        this.zinsSatz = zinsSatz;
        this.inhaber = inhaber;
    }

    public void einzahlen(double betrag){
        saldo = saldo + betrag;
    }

    public double getZinsSatz() {
        zinsSatz = 0.01;
        return zinsSatz;
    }

    /**
     * Berechnet den Zins für eine bestimmte Laufzeit(in Tagen)
     * und addiert diesen zum Saldo
     * @param laufzeit = Zins in einer bestimmten Laufzeit
     */
    public void verzinsen(double laufzeit){

        if(this.saldo > 50000 && this.saldo < 500000){
            this.zinsSatz = this.zinsSatz / 2;
        }
        else if (this.saldo > 500_000){
            this.zinsSatz = 0;
        }
        this.saldo += this.saldo * this.zinsSatz * (laufzeit / 365);

    }

    public double getSaldo() {
        return saldo;
    }

    public String getInhaber() {
        return this.inhaber;
    }
}

