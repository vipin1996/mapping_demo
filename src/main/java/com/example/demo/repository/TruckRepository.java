package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Car;
import com.example.demo.entity.Truck;

public interface TruckRepository extends JpaRepository<Truck, Integer>{

}
