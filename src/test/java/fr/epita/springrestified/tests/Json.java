package fr.epita.springrestified.tests;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.epita.springrestified.datamodel.Login;

public class Json {
	
	/**
	 * Method to convert java objects to json for testing on postman
	 */
	@Test
	public void getJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json=mapper.writeValueAsString(new Login());
			
			System.out.println(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}

}
