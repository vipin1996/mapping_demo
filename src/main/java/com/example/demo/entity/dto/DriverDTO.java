package com.example.demo.entity.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.entity.Driver;


public class DriverDTO {

	private int driverId;
	private String driverName;
	private TruckDTO truck;

	public int getDriverId() {
		return driverId;

	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	
	public DriverDTO() {
		
	}
	public DriverDTO(Driver driver) {
		this.driverId=driver.getDriverId();
		this.driverName=driver.getDriverName();
	}
}
