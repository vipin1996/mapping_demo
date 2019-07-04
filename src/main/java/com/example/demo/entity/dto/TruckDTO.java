package com.example.demo.entity.dto;

import com.example.demo.entity.Truck;

public class TruckDTO {

	private int truckId;
	private String colour;
	private DriverDTO driverDTO;

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public DriverDTO getDriverDTO() {
		return driverDTO;
	}

	public void setDriverDTO(DriverDTO driverDTO) {
		this.driverDTO = driverDTO;
	}

	public TruckDTO(Truck truck) {
		this.truckId = truck.getTruckId();
		this.colour = truck.getColour();
		if (truck.getDriver() != null) {
			this.driverDTO = new DriverDTO(truck.getDriver());
		}
	}
}
