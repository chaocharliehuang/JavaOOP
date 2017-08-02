package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		ba1.depositMoney(500, "checking");
		ba1.depositMoney(1000, "savings");
		ba1.displayMoney();
		ba1.withdrawMoney(100, "checking");
		ba1.withdrawMoney(200, "savings");
		ba1.displayMoney();
		BankAccount ba2 = new BankAccount();
		BankAccount ba3 = new BankAccount();
		System.out.println(BankAccount.getNumberOfAccounts());
		System.out.println(BankAccount.getTotalMoneyInAccounts());
	}
}