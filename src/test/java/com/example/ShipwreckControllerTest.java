package com.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.controller.ShipwreckController;
import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);	//because of this the shipwreckRepository will be inserted into the "sc"
	}
	
	@Test
	public void testShipwreckGet(){
		Shipwreck sw = new Shipwreck();
		sw.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(sw);
		
		//ShipwreckController sc = new ShipwreckController(); I can not use this since the repo in this object is empty, I need a mockito mock
		Shipwreck wreck = sc.get(1L);
		
		verify(shipwreckRepository).findOne(1l);
		
		//assertEquals(1l, wreck.getId().longValue());
		assertThat(wreck.getId(), is(1l));	//using Hamcrest
	}
	
}
