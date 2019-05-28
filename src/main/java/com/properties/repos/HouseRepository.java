package com.properties.repos;

import org.springframework.data.repository.CrudRepository;

import com.properties.model.House;

public interface HouseRepository extends CrudRepository<House, Integer> {

}
