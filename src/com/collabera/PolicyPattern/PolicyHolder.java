package com.collabera.PolicyPattern;

import java.util.Random;
import java.util.Scanner;

public class PolicyHolder {
	
	private String userName;
	private String userEMail;
	private int  accountNumber=0343;
	
	
	public String getPolicyHolderName() {
		return userName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.userName = policyHolderName;
	}
	public String getPolicyHolderEMail() {
		return userEMail;
	}
	public void setPolicyHolderEMail(String policyHolderEMail) {
		userEMail = policyHolderEMail;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	

	
	public void setUserInfo() {
		Scanner userInput = new Scanner(System.in);
		 
		System.out.println("Add your Name");
		setPolicyHolderName(userInput.next());
		
		System.out.println("Add your E-Mail");
		setPolicyHolderEMail(userInput.next());
		
		//userInput.close();
		
		this.accountNumber = new Random().nextInt();

	}

	//figure out how to make policy holder have multiple plan at the same time 
	//PolicyHolderInsurancePlan insurancePlan;
}
