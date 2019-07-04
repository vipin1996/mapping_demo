package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Driver {
	@Id
	@Column(name = "DRIVER_ID")
	private int driverId;

	@Column(name = "DRIVER_NAME")
	private String driverName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "truck_id")
	private Truck truck;

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

	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	public Driver() {
		
	}
//	public Driver(Driver driver) {
//		this.driverId=driver.getDriverId();
//		this.driverName=driver.getDriverName();
//	}

	@Override
	public String toString() {
		return "DriverDTO [driverId=" + driverId + ", driverName=" + driverName + "]";
	}
	
}
