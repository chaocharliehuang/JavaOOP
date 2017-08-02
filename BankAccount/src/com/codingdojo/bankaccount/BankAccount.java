package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private long checkingBalance;
	private long savingsBalance;
	private static long numberOfAccounts = 0;
	private static long totalMoneyInAccounts = 0;
	
	private String createAccountNumber() {
		Random rand = new Random();
        String accountNumber = "";
        for (int i = 1; i <= 10; i++) {
        		accountNumber += Character.toString((char)(rand.nextInt(26) + 'a'));
        }
        return accountNumber;
	}
	
	public BankAccount() {
		this.accountNumber = this.createAccountNumber();
		BankAccount.numberOfAccounts++;
	}
	
	public void depositMoney(long amount, String whichAccount) {
		if (whichAccount == "checking") {
			this.checkingBalance += amount;
		} else if (whichAccount == "savings") {
			this.savingsBalance += amount;
		}
		BankAccount.totalMoneyInAccounts += amount;
	}
	
	public void withdrawMoney(long amount, String whichAccount) {
		if (whichAccount == "checking" && this.checkingBalance >= amount) {
			this.checkingBalance -= amount;
		} else if (whichAccount == "savings" && this.savingsBalance >= amount) {
			this.savingsBalance -= amount;
		}
		BankAccount.totalMoneyInAccounts -= amount;
	}
	
	public void displayMoney() {
		System.out.println("Checking balance: $" + this.checkingBalance);
		System.out.println("Savings balance: $" + this.savingsBalance);
	}

	public long getCheckingBalance() {
		return checkingBalance;
	}

	public long getSavingsBalance() {
		return savingsBalance;
	}

	public static long getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static long getTotalMoneyInAccounts() {
		return totalMoneyInAccounts;
	}
}
