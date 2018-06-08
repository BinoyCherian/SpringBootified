package fr.epita.springrestified.configuration;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * The Response for the front end.
 * 
 * @author raaool
 *
 * @param <T>
 */
public class ResponseEdo<T> extends ResponseEntity<T>{
	
	
	public ResponseEdo(T body, HttpStatus status) {
		super(body, status);
	}

	/**
	 * Lost of object to be returned 
	 */
	List<T> objects;

	
	/**
	 * Gets the objects
	 * 
	 * @return the objects
	 */
	public List<T> getObjects() {
		return objects;
	}

	/**
	 * Sets the objects
	 * 
	 * @param objects the objects
	 */
	public void setObjects(List<T> objects) {
		this.objects = objects;
	}
}