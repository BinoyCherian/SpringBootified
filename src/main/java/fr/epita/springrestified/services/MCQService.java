package fr.epita.springrestified.services;

import java.util.List;

import fr.epita.springrestified.datamodel.MCQChoice;

/**
 * The interface for the mcq enterprise objects
 * 
 * @author raaool
 *
 */
public interface MCQService {
	
	/**
	 * Method to get the MCQChoice entities from the repository
	 * 
	 * @param MCQChoice The MCQChoice entity
	 * @return List<MCQChoice> The list of MCQChoice details.
	 */
	List<MCQChoice> getMCQChoices();
	
	
	/**
	 * Method to add a MCQChoice object to the repository.
	 * 
	 * @param MCQChoice The MCQChoice object to be added
	 * @return List of all the MCQChoice objects with the new object.
	 */
	List<MCQChoice> addMCQChoice(MCQChoice mcqChoice);
	
	
	/**
	 * Method to delete a MCQChoice object from the repository.
	 * 
	 * @param MCQChoice The MCQChoice object to be deleted
	 * @return The list of all the MCQChoice objects minus the deleted object
	 */
	List<MCQChoice> deleteMCQChoice(MCQChoice mcqChoice);
	
	
	/**
	 * Method to update the MCQChoice object in the repository.
	 * 
	 * @param MCQChoice The MCQChoice object to be updated
	 * @return TRUE/FALSE
	 */
	boolean updateMCQChoice(MCQChoice mcqChoice);

}
