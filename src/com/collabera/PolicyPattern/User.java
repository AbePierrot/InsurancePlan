package com.collabera.PolicyPattern;


public class User {
	
	public static void main(String[] args) {
		PolicyHolderInsurancePlan carInsurancePlan = new CarInsurancePolicyHolder();
		carInsurancePlan.insurancePlan();

	}
	
}
