package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Truck {
	@Id
	@Column(name = "TRUCK_ID")
	private int truckId;

	@Column(name = "COLOUR")
	private String colour;

	@OneToOne(mappedBy = "truck",cascade = CascadeType.ALL)
	private Driver driver;

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

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Truck() {
		
	}
//	public Truck(Truck truck) {
//		this.truckId=truck.getTruckId();
//		this.colour=truck.getColour();
//		Driver driver =new Driver(truck.getDriver());
//		this.driver=truck.getDriver();
//	}

	@Override
	public String toString() {
		return "Truck [truckId=" + truckId + ", colour=" + colour + ", driver=" + driver + "]";
	}

}
