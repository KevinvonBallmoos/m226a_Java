package edu.ab06_Bank;

public class Konto {

    public double saldo;
    private double zinssatz = 0.01;

    public void einzahlung(double amount) {

        this.saldo += amount;
    }

    public void verzinsen(int days) {

        if (this.saldo > 50000 && this.saldo < 500000) {
            this.zinssatz = this.zinssatz / 2;
        } else if (this.saldo > 500000) {
            this.zinssatz = 0;
        }

        this.saldo += this.saldo * zinssatz * days / 365;
    }

    public double getSaldo() {
        return this.saldo;
    }
}




