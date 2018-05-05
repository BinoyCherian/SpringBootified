package fr.epita.springrestified.services;

import java.util.List;

import fr.epita.springrestified.datamodel.Question;

/**
 * The question service
 * 
 * @author raaool
 *
 */
public interface QuestionService {
	
	/**
	 * Method to get the Question entities from the repository
	 * 
	 * @param Question The Question entity
	 * @return List<Question> The list of Question details.
	 */
	List<Question> getQuestions();
	
	
	/**
	 * Method to add a Question object to the repository.
	 * 
	 * @param Question The Question object to be added
	 * @return List of all the Question objects with the new object.
	 */
	List<Question> addQuestion(Question question);
	
	
	/**
	 * Method to delete a Question object from the repository.
	 * 
	 * @param Question The Question object to be deleted
	 * @return The list of all the Question objects minus the deleted object
	 */
	List<Question> deleteQuestion(Question question);
	
	
	/**
	 * Method to update the Question object in the repository.
	 * 
	 * @param Question The Question object to be updated
	 * @return TRUE/FALSE
	 */
	boolean updateQuestion(Question question);
}
