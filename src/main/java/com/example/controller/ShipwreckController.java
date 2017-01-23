package com.example.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	
	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@RequestMapping(value="shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list(){
		//return ShipwreckStub.list();
		return shipwreckRepository.findAll();
		
	}
	
	//auto import missign file: ctrl+shift+o
	@RequestMapping(value="shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		//return ShipwreckStub.create(shipwreck);
		return shipwreckRepository.saveAndFlush(shipwreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck create(@PathVariable long id){
		//return ShipwreckStub.get(id);
		return shipwreckRepository.findOne(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck create(@PathVariable long id, @RequestBody Shipwreck shipwreck){
		//return ShipwreckStub.update(id, shipwreck);
		Shipwreck existingShipwreck = shipwreckRepository.getOne(id);
		BeanUtils.copyProperties(shipwreck, existingShipwreck);
		return shipwreckRepository.saveAndFlush(existingShipwreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id){
		//return ShipwreckStub.delete(id);
		Shipwreck existingShipwreck = shipwreckRepository.getOne(id);
		shipwreckRepository.delete(existingShipwreck);
		return existingShipwreck;	//this also can return void
	}

}
