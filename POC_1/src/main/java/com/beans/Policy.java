package com.beans;

public class Policy {
	private String policyName;
	private int policySumInsured;
	private int premiumValue;
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(String policyName, int policySumInsured, int premiumValue) {
		super();
		this.policyName = policyName;
		this.policySumInsured = policySumInsured;
		this.premiumValue = premiumValue;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicySumInsured() {
		return policySumInsured;
	}
	public void setPolicySumInsured(int policySumInsured) {
		this.policySumInsured = policySumInsured;
	}
	public int getPremiumValue() {
		return premiumValue;
	}
	public void setPremiumValue(int premiumValue) {
		this.premiumValue = premiumValue;
	}
	@Override
	public String toString() {
		return "Policy [policyName=" + policyName + ", policySumInsured=" + policySumInsured + ", premiumValue="
				+ premiumValue + "]";
	}
	
	
}
