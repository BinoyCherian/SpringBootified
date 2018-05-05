package fr.epita.springrestified.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Enterprise object representing the question
 * 
 * @author raaool
 *
 */
@Entity
public class Question {

	/** The id for the question */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/** The question */
	private String question;
	
	/** The type of the question */
	private QuestionType type;

	/**
	 * The default constructor
	 * 
	 */
	public Question() {
	}

	/**
	 * Gets the question
	 * 
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Sets the question
	 * 
	 * @param question the question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * Gets the question type
	 * 
	 * @return the question type
	 */
	public QuestionType getType() {
		return type;
	}

	/**
	 * Sets the question type
	 * 
	 * @param type the type
	 */
	public void setType(QuestionType type) {
		this.type = type;
	}

	/**
	 * Gets the question id
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the question id
	 * @param id  the id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
