package fr.epita.springrestified.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.springrestified.datamodel.Login;
import fr.epita.springrestified.services.LoginService;
import fr.epita.springrestified.services.LoginServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestsForLoginFeature {
	
	@Test
	public void testGetLogins() {
		
		LoginService loginService = new LoginServiceImpl();
		assertNotNull(loginService.getLogins(new Login()));
	}

}
