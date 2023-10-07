package com.example.demo;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingControllerTest {
	
	@Autowired
  public GreetingController objectToTest;
	
  @Test
	void contextLoads() {
	}
	
	
	@Test
	void testGreetingIsNotNull(){
		Greeting result;
		result = objectToTest.greeting("mike");
		assertNotNull(result);
		
		
	}
	@Test
	void testGreetingReturnsMessageForChris(){
		Greeting result;
		result = objectToTest.greeting("Chris");
		assertEquals("I can't say hi to myself", result.getContent());
	}
	@Test
	void testGreetingReturnsMessageForNotChris(){
		Greeting result;
		result = objectToTest.greeting("George");
		assertEquals("Hello George!", result.content());
	}
}
