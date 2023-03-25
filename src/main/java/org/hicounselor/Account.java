package org.hicounselor;

public class Account {
    private String customerName;
    private String phoneNumber;
    private Long accountNumber;
    private double balance;

    public Account(String customerName, String phoneNumber, Long accountNumber, double balance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
