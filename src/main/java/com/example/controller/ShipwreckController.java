package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	
	@RequestMapping(value="shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list(){
		return ShipwreckStub.list();
		
	}
	
	//auto import missign file: ctrl+shift+o
	@RequestMapping(value="shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		return ShipwreckStub.create(shipwreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck create(@PathVariable long id){
		return ShipwreckStub.get(id);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck create(@PathVariable long id, @RequestBody Shipwreck shipwreck){
		return ShipwreckStub.update(id, shipwreck);
	}
	
	@RequestMapping(value="shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable long id){
		return ShipwreckStub.delete(id);
	}

}