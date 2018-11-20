package com.db;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.beans.Account;
import com.beans.Client;

public class Database {
	
	static Map<Integer, Account> accountsDB = new HashMap<Integer, Account>();
	
	static {
		
		Client c1 = new Client("Ramesh", "Kumar", "Delhi-123", 123);
		Client c2_1 = new Client("Diljeet", "Dusanj", "Chandigarh-123", 123);
		Client c2_2 = new Client("Guru", "Randhawa", "Amritser-323", 4523);
		
		
		int accountID = Integer.parseInt(c1.getFirstName().length()+c1.getAddress().length()+""+c1.getIdNumber());
		Set<Client> set = new HashSet<Client>();
		set.add(c1);
		Account a1 = new Account(accountID, "saving", false, set, 2000, null);
		
		set.clear();
		accountID = Integer.parseInt(c2_1.getFirstName().length()+c2_2.getAddress().length()+""+c2_1.getIdNumber()+""+c2_2.getIdNumber());
		set.add(c2_1);
		set.add(c2_2);
		Account a2 = new Account(accountID, "current", false, set, 2000, null);
		
		
		accountsDB.put(a1.getAccountNumber(), a1);
		accountsDB.put(a2.getAccountNumber(), a2);
		
	}
	
	public static Map<Integer,Account> getAllAccounts()
	{
		return accountsDB;
	}
	
	public static void addAccount(Account account)
	{
		accountsDB.put(account.getAccountNumber(),account);
	}
	
	public static Account getAccountByKey(int key)
	{
		return accountsDB.get(key);
	}
		
}
