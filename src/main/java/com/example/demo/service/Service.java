package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Car;
import com.example.demo.entity.Driver;
import com.example.demo.entity.Engine;
import com.example.demo.entity.Truck;
import com.example.demo.entity.dto.TruckDTO;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.TruckRepository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	CarRepository carRepository;
	@Autowired
	TruckRepository truckRepository;
	
	public Car addCar(Car car)
	{	Car car1=new Car();
		car1.setChasisNo(car.getChasisNo());
		car1.setCc(car.getCc());
		car1.setColour(car.getColour());
		Engine engine1=new Engine();
		engine1.setEngineNo(car.getEngine().getEngineNo());
		engine1.setManufacturer(car.getEngine().getManufacturer());
		car1.setEngine(engine1);
		carRepository.save(car1);
		return car1;
	}
	
	public TruckDTO addTruck(Truck truck)
	{
		truck.getDriver().setTruck(truck);
		truck=truckRepository.save(truck);
		System.out.println("Truck=== "+truck);
		return new TruckDTO(truck);
//		truck1.setTruckId(truck1.getTruckId());
//		truck1.setColour(truck1.getColour());
//		driver1.setDriverId(truck1.getDriver().getDriverId());
//		driver1.setDriverName(truck1.getDriver().getDriverName());
//		return truck1;
	}

}
