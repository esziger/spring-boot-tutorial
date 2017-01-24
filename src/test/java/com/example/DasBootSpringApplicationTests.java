package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.controller.HomeController;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DasBootSpringApplicationTests {

	@Test
	public void testApp() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "Das Boot, reporting for duty!");
	}

}
