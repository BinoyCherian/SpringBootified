package fr.epita.springrestified.services;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;

import fr.epita.springrestified.dao.LoginDao;
import fr.epita.springrestified.datamodel.Login;

public class LoginServiceImpl implements LoginService {
	
	@Inject
	SessionFactory sf;
	

	@Override
	public boolean checkLogin(Login login) {

		return false;
	}

	@Override
	public List<Login> getLogins(Login login) {
		
		if(sf!=null) {
			System.out.println("Hello");
		}
		
		LoginDao dao = new LoginDao();
		return dao.search(login);
	}

}
