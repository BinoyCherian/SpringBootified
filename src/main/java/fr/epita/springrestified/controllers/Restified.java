package fr.epita.springrestified.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.springrestified.datamodel.Login;
import fr.epita.springrestified.services.LoginService;

/**
 * Rest controller for the project. The methods will expose data fetched from the
 * database.
 * 
 * @author raaool
 *
 */
@RestController
@RequestMapping(value="/Restified")
public class Restified {
	
	/** The login service **/
	final LoginService loginService;
	
	/**
	 * Constructor 
	 * @param loginService The login service
	 */
	@Autowired
	public Restified(LoginService loginService) {
		this.loginService = loginService;
	}
	
	/**
	 * Method to return all the customer objects from the database.
	 * 
	 * @return Customer The customer json object
	 */
	@RequestMapping(method=RequestMethod.GET, value= "/logins")
	public List<Login> getLogins() {
		return loginService.getLogins();
	}
	
	/**
	 * Method to check for login object in the repository.
	 * 
	 * @param login The object to be checked
	 * @return TRUE/FALSE
	 */
	@RequestMapping(method=RequestMethod.POST, value="/checkLogin" , consumes= MediaType.APPLICATION_JSON_VALUE)
	public boolean checkLogin(@RequestBody Login login) {
		return loginService.checkLogin(login);
	}
	
	/**
	 * Method to add a login into the repository. This method calls the underlying login service.
	 * 
	 * @param login The login object to be added to the repository
	 * @return List<Login> The list of all the login objects
	 */
	@RequestMapping(method=RequestMethod.POST, value="/addLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Login> addLogin(@RequestBody Login login){
		return loginService.addLogin(login);
	}

}
