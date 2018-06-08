package fr.epita.springrestified.tests.login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.epita.springrestified.datamodel.Login;
import fr.epita.springrestified.services.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLoginServiceMethods {

	@Autowired
	LoginService loginService;
	
	@Autowired
	Login login;
	
	/**
	 * Test to check for service availablity
	 */
	@Test
	public void testLoginServiceNotNull() {
		assertNotNull(loginService);
	}
	
	/**
	 * Test to check the get service
	 */
	@Test
	public void testGetAllLogins() {
		assertNotNull(loginService.getLogins());
		assertTrue(loginService.getLogins().size()>1);
	}
	
	/**
	 * Test to check the add service
	 */
	@Test
	public void testAddingALoginObject() {
		
		login.setEmail("test@springrestified.com");
		login.setPassword("test");
		loginService.addLogin(login);
		
		assertTrue(loginService.getLogins().contains(login));
		
	}
	
	/**
	 * Test to check the update service
	 */
	@Test
	public void testUpdateLoginObject() {
		login.setPassword("xyztest");
		loginService.updateLogin(login);
		
		assertTrue(loginService.getLogins().contains(login));
	}
	
	/**
	 * Test to check for the delete service
	 */
	@Test
	public void testDeleteLoginObject() {
		List<Login> listOfLogins = loginService.getLogins();
		Login testObjectToBeDeleted = listOfLogins.get(0);
		loginService.deleteLogin(testObjectToBeDeleted);
		
		assertNotEquals(listOfLogins.size(), loginService.getLogins().size());
		assertFalse(loginService.getLogins().contains(testObjectToBeDeleted));
	}
}

