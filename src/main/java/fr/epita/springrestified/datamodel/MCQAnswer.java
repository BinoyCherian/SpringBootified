package fr.epita.springrestified.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Enterprise object representing the question paper.
 * 
 * @author raaool
 *
 */
public class MCQAnswer {
	
	/** The exam **/
	private Exam exam;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** The mcq choice **/
	private MCQChoice mcqChoice;

	/**
	 * Gets the exam 
	 * 
	 * @return the exam
	 */
	public Exam getExam() {
		return exam;
	}

	/**
	 * Sets the exam
	 * 
	 * @param exam the exam to set
	 */
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	/**
	 * Gets the mcq choice
	 * 
	 * @return the mcqChoice
	 */
	public MCQChoice getMcqChoice() {
		return mcqChoice;
	}

	/**
	 * Sets the mcq choice
	 * 
	 * @param mcqChoice the mcqChoice to set
	 */
	public void setMcqChoice(MCQChoice mcqChoice) {
		this.mcqChoice = mcqChoice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
