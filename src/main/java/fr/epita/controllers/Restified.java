package fe.epita.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.datamodel.Customer;

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
	
	//TODO Bind a db and provide endpoints
	
	/**
	 * Method to return all the customer objects from the database.
	 * 
	 * @return Customer The customer json object
	 */
	@RequestMapping(method=RequestMethod.GET, value="/customers")
	public Customer greeting() {
		//TODO Fix the return to fetch from db
		return new Customer("Cardinal", "Tom B. Erichsen", "Skagen 21", "Stavanger", "4006", "Norway");
	}

}
