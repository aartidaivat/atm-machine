package org.hicounselor;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Long,Account> accounts = new HashMap<>();

    public void createAccount(String name, String phoneNumber) {
        Long accountId = System.currentTimeMillis();
        Account account = new Account(name,phoneNumber,accountId,0);
        accounts.put(accountId,account);
        System.out.println("Account Number:"+accountId);
    }

    public void accountInfo(long accountId) {
        Account account = accounts.get(accountId);

        if(account == null) {
            System.out.println("Account not found");
        }
        else {
            System.out.println("Name:" +account.getCustomerName());
            System.out.println("Phone no:" +account.getPhoneNumber());
            System.out.println("Balance:" +account.getBalance());
        }
    }

    public void deposit(long accountId, double amount) {
         Account account = accounts.get(accountId);

         if(account == null) {
             System.out.println("Account not found");
         }
         else if(amount < 0) {
             System.out.println("Invalid input");
         }
         else {
             account.setBalance(account.getBalance() + amount);
             System.out.println("Amount is successfully deposited");
         }
    }

    public void withdraw(long accountId, double amount) {
        Account account = accounts.get(accountId);

        if(account == null) {
            System.out.println("Account not found");
        }
        else if(amount < 0) {
            System.out.println("Invalid input");
        }
        else if(account.getBalance() < amount) {
            System.out.println("Insufficient balance");
        }
        else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Amount is successfully withdraw");
        }
    }

    public void transfer(long sourceAccountId, long destinationAccountId, double amount) {
        Account srcAccount = accounts.get(sourceAccountId);
        Account desAccount = accounts.get(destinationAccountId);

        if(srcAccount == null || desAccount == null) {
            System.out.println("Account not found");
        }
        else if(amount < 0) {
            System.out.println("Invalid input");
        }
        else if(srcAccount.getBalance() < amount) {
            System.out.println("Insufficient balance");
        }
        else {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            desAccount.setBalance(desAccount.getBalance() + amount);
            System.out.println("Amount is successfully transferred");
            System.out.println("Amount is successfully transferred");
        }
    }
}
