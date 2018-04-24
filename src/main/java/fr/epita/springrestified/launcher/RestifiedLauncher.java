package fr.epita.springrestified.launcher;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Enterprise class that packages everything.
 * 
 * @author raaool
 *
 */
@SpringBootApplication
@ComponentScan({"fr.epita.springrestified.dao","fr.epita.springrestified.services","fr.epita.springrestified.controllers"})
public class RestifiedLauncher {

	public static void main(String[] args) {
		SpringApplication.run(RestifiedLauncher.class, args);
	}
}
