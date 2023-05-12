package com.example.ContinuedBankAccounts.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        BankAccount account1 = new BankAccount("Matt", 2000, 123456);
        BankAccount account2 = new BankAccount("Sarah", 1500, 654321);
        accounts.add(account1);
        accounts.add(account2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello world! Welcome to the Bank of Matt!");
        System.out.println("Are you an existing customer (Press 1 or 2)? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = scanner.nextInt();

        while (choice != -1) {
            if (choice == 1) {
                System.out.println("Which account would you like to access?");
                for (int i = 0; i < accounts.size(); i++) {
                    System.out.println((i + 1) + ". " + accounts.get(i).getName());
                }
                int accountChoice = scanner.nextInt() - 1;
                BankAccount selectedAccount = accounts.get(accountChoice);

                System.out.println("Hello " + selectedAccount.getName() + "!");
                System.out.println("Welcome to the main menu! What would you like to do today?");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check balance");
                System.out.println("4. Make transfer to another account");
                System.out.println("5. Exit");
                int actionChoice = scanner.nextInt();

                if (actionChoice == 1) {
                    System.out.println("How much would you like to deposit?");
                    double depositAmount = scanner.nextDouble();
                    selectedAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: $" + selectedAccount.getBalance());
                } else if (actionChoice == 2) {
                    System.out.println("How much would you like to withdraw?");
                    double withdrawAmount = scanner.nextDouble();
                    selectedAccount.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful. New balance: $" + selectedAccount.getBalance());
                } else if (actionChoice == 3) {
                    selectedAccount.display();
                } else if (actionChoice == 4) {
                    System.out.println("How much would you like to transfer?");
                    double transferAmount = scanner.nextDouble();
                    System.out.println("Which account would you like to transfer to?");
                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i) != selectedAccount) {
                            System.out.println((i + 1) + ". " + accounts.get(i).getName() + " (" + accounts.get(i).getAccountNumber() + ")");
                        }
                    }
                    int transferChoice = scanner.nextInt() - 1;
                    if (transferChoice >= 0 && transferChoice < accounts.size() && accounts.get(transferChoice) != selectedAccount) {
                        BankAccount transferAccount = accounts.get(transferChoice);
                        selectedAccount.transfer(transferAccount, transferAmount);
                        System.out.println("The name on the account is: " + selectedAccount.getName() + " and they have a balance of $" + selectedAccount.getBalance());
                        System.out.println("The name on the account is: " + transferAccount.getName() + " and they have a balance of $" + transferAccount.getBalance());

                    } else {
                        System.out.println("Invalid choice.");
                    }
                } else if (actionChoice == 5) {
                   break;
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (choice == 2) {
                System.out.println("Let's make a new account!");
                BankAccount newAccount = new BankAccount();
                accounts.add(newAccount);
                System.out.println("New account created.");
                newAccount.display();
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.println("Are you an existing customer? (-1 to exit)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            choice = scanner.nextInt();
        }
    }

}
