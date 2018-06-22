package fr.epita.springrestified.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.springrestified.configuration.ResponseEdo;
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
@RequestMapping(value="/restified/login")
@CrossOrigin(origins = "http://localhost:4200")
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
	 * Method to return all the login objects from the database.
	 * 
	 * @return List<Login> The login json object
	 */
	@RequestMapping(method=RequestMethod.GET, value= "/logins")
	@ResponseBody
	public ResponseEdo getLogins() {
		return new ResponseEdo<List<Login>>(loginService.getLogins(),HttpStatus.OK);
	
	}
	
	
	/**
	 * Method to check for login object in the repository.
	 * 
	 * @param login The object to be checked
	 * @return TRUE/FALSE
	 */
	@RequestMapping(method=RequestMethod.POST, value="/checklogin" , consumes= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public boolean checkLogin(@RequestBody Login login) {
		if( loginService.checkLogin(login)) {
			return true;
		}
		else {
			return false;
			}
	}
	
	/**
	 * Method to add a login into the repository. This method calls the underlying login service.
	 * 
	 * @param login The login object to be added to the repository
	 * @return List<Login> The list of all the login objects
	 */
	@RequestMapping(method=RequestMethod.POST, value="/addLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEdo addLogin(@RequestBody Login login){
		
		return new ResponseEdo(loginService.addLogin(login),HttpStatus.CREATED);
	}

	/**
	 * Method to delete a login object from the repository. This method calls the underlying login service.
	 * @param login The login object to be deleted
	 * @return List<Login> The list of all the login objects
	 */
	@RequestMapping(method=RequestMethod.POST, value="/deleteLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Login> deleteLogin(@RequestBody Login login){
		return loginService.deleteLogin(login);
	}
	
	/**
	 * Method to update a login object in the repository.
	 * 
	 * @param login The object to be updated
	 * @return TRUE/FALSE
	 */
	@RequestMapping(method=RequestMethod.POST, value="/updateLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateLogin(@RequestBody Login login) {
		return loginService.updateLogin(login);
	}
}
