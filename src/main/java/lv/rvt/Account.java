package lv.rvt;

import java.util.*;

public class Account {

    private double balance;
    private String owner;

    public Account(String intowner, double intbalance) {
        this.balance= intbalance;
        this.owner = intowner;
    }
     
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString(){
        return this.owner + " balance: " + this.balance;
    }
}
 