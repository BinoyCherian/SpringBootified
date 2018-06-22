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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The question */
	private String question;
	
	/** The type of the question */
	private String type;

	/**
	 * The default constructor
	 * 
	 */
	public Question() {
		//default constructor
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
	public String getType() {
		return type;
	}

	/**
	 * Sets the question type
	 * 
	 * @param type the type
	 */
	public void setType(String type) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Question))
			return false;
		Question other = (Question) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (type != other.type)
			return false;
		
		return true;
	}
}
