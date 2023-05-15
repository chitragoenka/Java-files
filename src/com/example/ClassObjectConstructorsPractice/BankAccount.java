package com.example.ClassObjectConstructorsPractice;

public class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

//    public void printAccountDetails() {
//        System.out.println(accountHolderName + "'s Account balance: " + balance);
//            }

    // override
    @Override public String toString(){

        return accountHolderName + "'s Account balance: " + balance;
    }

}

