package fr.epita.springrestified.tests.login;

import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.hql.internal.ast.tree.RestrictableStatement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestLoginServiceMethods {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testGetLogins() {
		//String body = this.restTemplate.getForObject("/Restified/logins", String.class);
		Map<String, String> map=this.restTemplate.getForObject("/Restified/logins", Map.class);
		
		for (Entry<String, String> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
	
	public void testCheckLogin() { 
		//String body = this.restTemplate.getForObject("/Restified/logins", String.class);
				Map<String, String> map=this.restTemplate.getForObject("/Restified/logins", Map.class);
				
	}

}

