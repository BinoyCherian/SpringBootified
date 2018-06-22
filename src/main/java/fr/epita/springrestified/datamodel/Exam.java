package fr.epita.springrestified.datamodel;

import javax.persistence.Entity;

/**
 * Enterprise object representing the exam properties
 * 
 * @author raaool
 *
 */
@Entity
public class Exam {
	
	/** The exam title **/
	private String title;

	/**
	 * Gets the title
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title
	 * 
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
