package com.client;

import java.util.Random;
import java.util.Scanner;

import com.beans.Account;
import com.beans.Client;

public class InputUtil {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String getString(String tagline)
	{
		System.out.println("\n Enter "+tagline);
		String data = sc.nextLine();
		return data;
	}
	
	public static int getInt(String tagline)
	{
		System.out.println("\n Enter "+tagline);
		int data = Integer.parseInt(sc.nextLine());
		return data;
	}
	
	public static boolean getJoinedAccount()
	{
		boolean isJoined = false;
		
		System.out.println("\n Enter <1> for Joined and <0> for Non Joined Account");
		int data = Integer.parseInt(sc.nextLine());
		if(data == 1) isJoined = true;
		else if(data == 0) isJoined = false;
		else {
			System.out.println(" Invalid Choice");
			getJoinedAccount();
		}
		
		return isJoined;
	}
	
	public static String getAccountType()
	{
		String accountType = null;
		System.out.println("\n Chhose Account Type Press \n (1) for Saving and (2) for urrent");
		int data = Integer.parseInt(sc.nextLine());
		if(data == 1) accountType = "saving";
		else if(data == 2) accountType = "current";
		else {
			System.out.println(" Invalid Choice");
			getAccountType();
		}
		
		return accountType;
	}
	
	public static int getAutoAccountNumber()
	{
		Random random = new Random();
		int number =  random.nextInt(200000);
		
		if(number < 1000) getAutoAccountNumber();
		
		return number;
	}

}
