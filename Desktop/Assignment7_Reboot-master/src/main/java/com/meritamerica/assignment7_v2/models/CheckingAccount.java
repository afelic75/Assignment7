package com.meritamerica.assignment7_v2.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class CheckingAccount extends BankAccount {

	static final double DEFAULT_INTEREST_RATE = .0001;
	
	@ManyToOne
	private AccountHolder accountHolders;

	public CheckingAccount() {
		super.setInterestRate(DEFAULT_INTEREST_RATE);
	}

	public CheckingAccount(double openingBalance) {
		super(openingBalance, DEFAULT_INTEREST_RATE);
	}

	public CheckingAccount(BankAccount bankAccount) {
		super(bankAccount.getBalance(), bankAccount.getInterestRate(), bankAccount.getAccountNumber(),
				bankAccount.getAccountOpenedOn());

	}

	public CheckingAccount(double balance, double interestRate, long accountNumber, Date accountOpenedOn) {
		super(balance, interestRate, accountNumber, accountOpenedOn);
	}

	private long accountHolder;

	public long getAccountHolder() {
		return this.accountHolder;
	}

	public void setAccountHolder(long acctholder) { //changed this
		this.accountHolder = acctholder;
	}

}