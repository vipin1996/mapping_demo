package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Car;
import com.example.demo.entity.Truck;
import com.example.demo.entity.dto.TruckDTO;
import com.example.demo.service.Service;

@RestController

public class Controller {
	
	@Autowired
	Service service;
	
	@PostMapping("/car")
	public Car addCar(@RequestBody Car car)
	{
		return service.addCar(car);
	}
	
	@PostMapping("/truck")
	public TruckDTO addTruck(@RequestBody Truck truck)
	{
		return service.addTruck(truck);
	}
	

}
