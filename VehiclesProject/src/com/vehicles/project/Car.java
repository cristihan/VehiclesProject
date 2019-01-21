package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String colour) {
		super(plate, brand, colour);
		
	}
	
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoFrontWheels(frontWheels);
		addTwoFrontWheels(backWheels);
		
	}
	
	public void addTwoFrontWheels(List<Wheel> wheels) throws Exception {
		if(wheels.size() !=2)
			throw new Exception();
		
		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
		
		if(!rightWheel.equals(leftWheel))
			throw new Exception();
		
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	
	}
	
	

}
