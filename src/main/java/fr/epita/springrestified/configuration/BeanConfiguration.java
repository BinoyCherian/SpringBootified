package fr.epita.springrestified.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.epita.springrestified.datamodel.Login;
import fr.epita.springrestified.datamodel.MCQChoice;
import fr.epita.springrestified.datamodel.Question;

/**
 * Configuration class for the beans
 * 
 * @author raaool
 *
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Login newLogin() {
		return new Login();
	}
	
	@Bean
	public Question newQuestion() {
		return new Question();
	}
	
	@Bean
	public MCQChoice mcqChoice() {
		return new MCQChoice();
	}
}
