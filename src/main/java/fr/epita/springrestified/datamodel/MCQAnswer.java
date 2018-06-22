package fr.epita.springrestified.datamodel;

import javax.persistence.Entity;

/**
 * The Enterprise object representing the question paper.
 * 
 * @author raaool
 *
 */
@Entity
public class MCQAnswer {
	
	/** The exam **/
	private Exam exam;
	
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

}
