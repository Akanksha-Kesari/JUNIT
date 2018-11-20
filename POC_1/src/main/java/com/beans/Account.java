package com.beans;

import java.util.List;
import java.util.Set;

public class Account {
	
	private int accountNumber;
	private String accountType;// current and saving
	private boolean isjoined;
	private Set<Client> clinets;  // can hold one or multiple
	private int balance;
	private List<Policy> policies;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNumber, String accountType, boolean isjoined, Set<Client> clinets, int balance,
			List<Policy> policies) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.isjoined = isjoined;
		this.clinets = clinets;
		this.balance = balance;
		this.policies = policies;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isIsjoined() {
		return isjoined;
	}

	public void setIsjoined(boolean isjoined) {
		this.isjoined = isjoined;
	}

	public Set<Client> getClinets() {
		return clinets;
	}

	public void setClinets(Set<Client> clinets) {
		this.clinets = clinets;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", isjoined=" + isjoined
				+ ", clinets=" + clinets + ", balance=" + balance + ", policies=" + policies + "]";
	}
	
	
}
