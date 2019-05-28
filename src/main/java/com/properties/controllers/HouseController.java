package com.properties.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.properties.model.House;
import com.properties.services.HouseService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class HouseController {
	
	@Autowired
	private HouseService houseService;
	
	@RequestMapping("/houses")
	public List<House> getAllHouses() {
		return houseService.getAllHouses();
	}
	
	@RequestMapping("/houses/{id}")
	public House getHouse(@PathVariable int id) {
		return houseService.getHouse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/houses")
	public void addHouse(@RequestBody House house) {
		houseService.addHouse(house);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/houses/{id}")
	public void updateHouse(@RequestBody House house, @PathVariable int id) {
		houseService.updateHouse(id,house);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/houses/{id}")
	public void deleteHouse(@PathVariable int id) {
		houseService.deleteHouse(id);
	}
}
