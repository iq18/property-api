package com.properties.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.properties.model.House;
import com.properties.repos.HouseRepository;



@Service
public class HouseService {
	
	@Autowired
	private HouseRepository houseRepository;
	
	public List<House> getAllHouses() {
		List<House> houses = new ArrayList<>();
		houseRepository.findAll()
		.forEach(houses::add);
		return houses;
	}
	
	public House getHouse(int id) {
		House house = houseRepository.findById(id).get();
		return house;
	}
	
	public void addHouse(House house) {
		houseRepository.save(house);
	}
	
	public void updateHouse(int id, House house) {
		houseRepository.save(house);
		
	}
	
	public void deleteHouse(int id) {
		//topics.removeIf(t -> t.getId().equals(id));
		houseRepository.deleteById(id);
		
	}


}
