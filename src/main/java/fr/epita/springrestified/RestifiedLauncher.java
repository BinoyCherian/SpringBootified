package fr.epita.springrestified;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Enterprise class that packages everything and launches the application.
 * 
 * @author raaool
 *
 */
@SpringBootApplication
public class RestifiedLauncher {

	public static void main(String[] args) {
		SpringApplication.run(RestifiedLauncher.class, args);
	}
}
