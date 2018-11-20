package com.db;

import java.util.Map;

import com.beans.Account;

public class AccountDAOImpl {
	
	public void addAccount(Account account)
	{
			Database.addAccount(account);
	}
		
	public Map<Integer,Account> getAllAccounts()
	{
		return Database.getAllAccounts();
	}
	
	public Account getAccountByNumber(int token)
	{
		return Database.getAccountByKey(token);
		
	}

}
