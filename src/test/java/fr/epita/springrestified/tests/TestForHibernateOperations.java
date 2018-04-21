package fr.epita.springrestified.tests;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestForHibernateOperations {
	
	@Inject
	SessionFactory sf;
	
	@Test
	public void testForEntitiesNotNull() {
		assertNotNull(sf);
	}

}
