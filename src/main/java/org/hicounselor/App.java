package org.hicounselor;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Choose an option:\n" +
                            "1. Create-Account\n"+
                            "2. Deposit\n" +
                            "3. Withdraw\n" +
                            "4. Transfer\n" +
                            "5. Account-Info");

        while(sc.hasNext()) {
            String command=sc.next();

            switch (command) {
                case "Create-Account" :
                    System.out.println("Enter your name and phone number:");
                    String name = sc.next();
                    String phoneNumber = sc.next();
                    bank.createAccount(name, phoneNumber);
                    System.out.println("Your account is successfully created");
                    break;

                case "Deposit" :
                    System.out.println("Enter account number and amount:");
                    long accountNumber = sc.nextLong();
                    double amount = sc.nextDouble();
                    bank.deposit(accountNumber, amount);
                    break;

                case "Withdraw" :
                    System.out.println("Enter account number and amount:");
                    bank.withdraw(sc.nextLong(), sc.nextDouble());
                    break;

                case "Transfer" :
                    System.out.println("Enter source account number,desination account number and amount:");
                    bank.transfer(sc.nextLong(), sc.nextLong(), sc.nextDouble());
                    break;

                case "Account-Info" :
                    System.out.println("Enter account number:");
                    bank.accountInfo(sc.nextLong());
                    break;

                default:
                    System.out.println("Invalid Command");
                    break;
            }
        }
    }
}
