package fr.epita.springrestified.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epita.springrestified.dao.LoginRepository;
import fr.epita.springrestified.datamodel.Login;

/**
 * The service impl for the login service.
 * 
 * @author raaool
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	/** The login repository **/
	final LoginRepository loginRepository;
	
	/**
	 * The constructor
	 * 
	 * @param loginRepository The repository
	 */
	@Autowired
	public LoginServiceImpl(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}

	/**
	 * @see fr.epita.springrestified.services.LoginService#checkLogin(fr.epita.springrestified.datamodel.Login)
	 */
	public boolean checkLogin(Login login) {
		return loginRepository.checkLogin(login.getEmail(), login.getPassword())>=1;
	}
	
	/**
	 * @see fr.epita.springrestified.services.LoginService#getLogins()
	 */
	public List<Login> getLogins() {
		return loginRepository.findAll();
	}
	
	/**
	 * @see fr.epita.springrestified.services.LoginService#addLogin(fr.epita.springrestified.datamodel.Login)
	 */
	public List<Login> addLogin(Login login) {
		loginRepository.save(login);
		return getLogins();
	}

	/**
	 * @see fr.epita.springrestified.services.LoginService#deleteLogin(fr.epita.springrestified.datamodel.Login)
	 */
	public List<Login> deleteLogin(Login login) {
		loginRepository.delete(login);
		return getLogins();
	}

	/**
	 * @see fr.epita.springrestified.services.LoginService#updateLogin(fr.epita.springrestified.datamodel.Login)
	 */
	public boolean updateLogin(Login login) {

		if (loginRepository.findById(login.getEmail()).isPresent()) {
			addLogin(login);
			return true;
		}
		return false;
	}
}
