package com.collabera.PolicyPattern;


public class VehicleInfo {
	private String carModel;
	private String carMake;
	private int carPlateNumnber;
    private int vehicleVINNumber;
    
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public int getCarPlateNumnber() {
		return carPlateNumnber;
	}
	public void setCarPlateNumnber(int carPlateNumnber) {
		this.carPlateNumnber = carPlateNumnber;
	}

	public int getVehicleVINNumber() {
		return vehicleVINNumber;
	}
	public void setVehicleVINNumber(int vehicleVINNumber) {
		this.vehicleVINNumber = vehicleVINNumber;
	}

}
