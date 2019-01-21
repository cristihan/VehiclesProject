package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	
	protected String plate;
	protected String brand;
	protected String colour;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	
	public Vehicle(String plate, String brand, String colour) {
		this.plate = plate;
		this.brand = brand;
		this.colour = colour;
	}

}
