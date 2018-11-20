package com.beans;

public class Client {

	private String firstName;
	private String lastName;
	private String address;
	private long idNumber; // like adhar no,PAN number, DL number etc
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String firstName, String lastName, String address, long idNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.idNumber = idNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", idNumber="
				+ idNumber + "]";
	}
	
	
	
}
