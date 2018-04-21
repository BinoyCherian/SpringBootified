package fr.epita.springrestified.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.springrestified.datamodel.Login;
import fr.epita.springrestified.services.LoginService;
import fr.epita.springrestified.services.LoginServiceImpl;

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
	
	/**
	 * Method to return all the customer objects from the database.
	 * 
	 * @return Customer The customer json object
	 */
	@RequestMapping(method=RequestMethod.GET, value= {"/logins","/logins/{loginId}"})
	public List<Login> getCustomers(@PathVariable Optional<String> loginId) {
		
		LoginService loginService = new LoginServiceImpl();
		
		Login login = new Login();

		return loginService.getLogins(login);
	}

}
