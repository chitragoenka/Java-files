package com.example.ClassObjectConstructorsPractice;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500, "John");


        myAccount.deposit(100);
//        myAccount.printAccountDetails();
        System.out.println(myAccount);

        //Bank Transfer
        BankAccount account1 = new BankAccount(5000, "Larry");
        BankAccount account2 = new BankAccount(300, "Mary");

        account1.withdrawal(100);
        account2.deposit(100);

//        account1.printAccountDetails();
//        account2.printAccountDetails();

        System.out.println(account1);
        System.out.println(account2);


    }
}