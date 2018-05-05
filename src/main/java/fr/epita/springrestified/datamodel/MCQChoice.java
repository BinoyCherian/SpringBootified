package fr.epita.springrestified.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * Enterprise object representing the mcqchoice.
 * 
 * @author raaool
 *
 */
@Entity
public class MCQChoice {

	/** The id for the mcq choice */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/** The choice for the mcq choice */
	private String choice;
	
	
	/** The valid answer for the mcqchoice */
	private boolean valid;

	/** The order of the mcq choice */
	@Column(name = "MCQCHOICE_ORDER")
	private int order;

	/** The question for the mcqchoice */
	@ManyToOne
	private Question question;

	/**
	 * Default constructor
	 */
	public MCQChoice() {
	}

	/**
	 * Gets the choice
	 * 
	 * @return the choice
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * Sets the choice
	 * 
	 * @param choice the choice
	 */
	public void setChoice(String choice) {
		this.choice = choice;
	}

	/**
	 * Gets the valid
	 * 
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * Sets the valid 
	 * 
	 * @param valid the valid
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * Gets the order
	 * 
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * Sets the order
	 * 
	 * @param order the order
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * Gets the id
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id
	 * 
	 * @param id the id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	
	/**
	 * Sets the question
	 * 
	 * @param question the question
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/**
	 * Gets the question
	 * 
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}
}
