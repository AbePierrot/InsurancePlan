package com.collabera.PolicyPattern;

import java.util.Scanner;

public class CarInsurancePolicyHolder extends PolicyHolder implements PolicyHolderInsurancePlan  {

	@Override
	public void insurancePlan() {
		Scanner userInput = new Scanner(System.in);
		setUserInfo();//check if the user exist [next update- save program state]
		initializeCarInfo(userInput);
		System.out.println(selectInsurancePlan(userInput));
		userInput.close();
	}
	
	private void initializeCarInfo(Scanner userInput) {
		 //Scanner userInput= new Scanner(System.in);
	   	 VehicleInfo carInfo= new VehicleInfo();
	   	 
	   	  System.out.println("Add Car Model: ");
	   	  carInfo.setCarModel(userInput.next());
	   	 
	   	  System.out.println("Add Car Make: ");
	   	  carInfo.setCarMake(userInput.next());
	   	  
	   	  System.out.println("Add Car Plate Number: ");
	   	  carInfo.setCarPlateNumnber(userInput.nextInt());
	   	  
	      System.out.println("Add Car VIN Number ");
	   	  carInfo.setVehicleVINNumber(userInput.nextInt());
	   	  
	   	  //userInput.close();
	}
	
	
	 private String selectInsurancePlan(Scanner userInput) {
		 
		 
		 System.out.println("------Car Insurance Menu-----");
		 System.out.println("1) Standard Policy - Car Insurance");
		 System.out.println("2) Gold Policy - Car Insurance ");
		 System.out.println("3) Diamond Policy - Car Insurance");
		 System.out.println("4) Platinum Policy - Car Insurance");
		 
		 System.out.println("Select Insurance Plan:");
		// Scanner userInput = new Scanner(System.in);
		 int menuInput= userInput.nextInt();
		 //userInput.close();
		 
		 //provide error checking for user Input 
		 
	    if(menuInput==1) {
	    	return returnPolicyHolderPlan("Standard");
	    }else if (menuInput==2){
	    	return returnPolicyHolderPlan("Gold");
	    }else if (menuInput==3) {
	    	return returnPolicyHolderPlan("Diamond");
	    }else {
	    	return returnPolicyHolderPlan("Platinum");
	    }
	 }
	 
	 private String returnPolicyHolderPlan(String policyType) {
		 return String.format("%s%S", "Current Car Insurance Plan: ",policyType);
	 }







}
