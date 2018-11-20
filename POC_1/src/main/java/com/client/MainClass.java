package com.client;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.beans.Account;
import com.beans.Client;
import com.db.AccountDAOImpl;

public class MainClass {

	AccountDAOImpl dao = new AccountDAOImpl();
	
	public static void main(String[] args) {
		
		MainClass appObj = new MainClass();
		
		while(true)
		{
			System.out.println("1. Create Account");
			System.out.println("2. Search Account");
			System.out.println("3. Display Account");
			System.out.println("0. EXIT");
			
			int choice = InputUtil.getInt("Your Choice");
			switch(choice)
			{
				case 1:appObj.createAccount();
						break;
				case 2:appObj.SearchAccount();
						break;
				case 3:appObj.displayAllAccounts();
						break;
			}//end switch
	
		}//end while
	}//end main
	
	public void createAccount()
	{
		System.out.println("\n  Enter Account Information ");
		//(accountNumber, accountType,  isjoined, Set<Client> clinets,  balance,)
		
		Account account = new Account();
		
		account.setAccountNumber(InputUtil.getAutoAccountNumber());
		account.setAccountType(InputUtil.getAccountType());
		account.setIsjoined(InputUtil.getJoinedAccount());
		
		Set<Client> clientList = new HashSet<Client>();
		if(account.isIsjoined())
		{
			for(int i=0;i<InputUtil.getInt("Number of Clients");i++)
			{
				Client client = createClient();
				clientList.add(client);
			}
		}
		else
		{
			Client client = createClient();
			clientList.add(client);
		}
		account.setClinets(clientList);
		account.setBalance(InputUtil.getInt("Balance"));
		
		dao.addAccount(account);
		
	}
	
	
	public Client createClient()
	{
		System.out.println(" \n Enter Client Information ");
		Client client = new Client();
		client.setIdNumber(InputUtil.getInt("ID Number"));
		client.setFirstName(InputUtil.getString("First Name"));
		client.setLastName(InputUtil.getString("Last Name"));
		client.setAddress(InputUtil.getString("Address"));
		
		return client;
	}
	
	public void SearchAccount()
	{
		System.out.println("\n Welcome Search Utility");
		int searchAccountNumber = InputUtil.getInt("Account Number To Be Searched ");
		
		Account account = dao.getAccountByNumber(searchAccountNumber);
		
		if(account != null)
		{
			displayAccount(account);
			System.out.println("============================================================================================");
		}
		else
		{
			System.out.println(" Wrong Account Number or Account Not Available, Try Again");
		}
		
	}
	
	public void displayAccount(Account account)
	{
		System.out.println("\n Account Number "+account.getAccountNumber());
		System.out.println("\n Account Type"+account.getAccountType());
		System.out.println("\n Joinet Account "+account.isIsjoined());
		System.out.println("\n Account Clients Info"+account.getClinets());
		System.out.println("\n Account Balance"+account.getBalance());
		System.out.println("\n Account Policies "+account.getPolicies());
	}

	
	public void displayAllAccounts()
	{
		Collection<Account> allAccounts = dao.getAllAccounts().values();
		int x = 0;
		for (Account account : allAccounts) {
			System.out.println(" S.NO "+(++x));
			displayAccount(account);
			System.out.println("-------------------------------------------------------------------------------------------------------------");
		}
	}

}


