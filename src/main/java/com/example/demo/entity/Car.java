package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@Column(name = "CHASIS_NO")
	@GeneratedValue
	private long chasisNo;
	
	@Column(name = "CC")
	private int cc;
	
	@Column(name = "COLOUR")
	private String colour;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ENGINE_NO")
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public long getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(long chasisNo) {
		this.chasisNo = chasisNo;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (chasisNo ^ (chasisNo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (chasisNo != other.chasisNo)
			return false;
		return true;
	}

}
