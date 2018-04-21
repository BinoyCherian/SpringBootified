package fr.epita.springrestified.services;

import java.util.List;

import fr.epita.springrestified.datamodel.Login;

/**
 * 
 * The interface for the login service.
 * 
 * @author raaool
 *
 */
public interface LoginService {

	/**
	 * Method to check the login details.
	 * 
	 * @param login The login entity
	 * @return TRUE/FALSE
	 */
	boolean checkLogin(Login login);
	
	/**
	 * Method to get the login entities
	 * 
	 * @param login The login entity
	 * @return List<Login> The list of Login details.
	 */
	List<Login> getLogins(Login login);
}
