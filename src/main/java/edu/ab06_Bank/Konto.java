package edu.ab06_Bank;

public class Konto {

    private double saldo;
    private double zinsSatz;

    public Konto(){
        zinsSatz = 0.01;
    }

    public void einzahlen(double betrag){
        saldo = saldo + betrag;
    }

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
}

