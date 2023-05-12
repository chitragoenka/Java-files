package com.example.ContinuedBankAccounts.BankAccount;

import java.util.Scanner;

public class BankAccount {
    private String name;
    private double balance;
    private int accountNumber;

    // Constructor with account number parameter
    public BankAccount(String name, double balance, int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Constructor with user input for name and balance
    public BankAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name for the account?");
        this.name = scanner.nextLine();
        System.out.println("What is the beginning balance for the account?");
        this.balance = scanner.nextDouble();
        System.out.println("What is the account number for the account?");
        this.accountNumber = scanner.nextInt();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void display() {
        System.out.println("Account Holder's Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + balance);
    }

    public void transfer(BankAccount account, double amount) {
        if (amount <= balance) {
            balance -= amount;
            account.deposit(amount);
            System.out.println("$" + amount + " transferred to " + account.getName() + "'s account.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

}