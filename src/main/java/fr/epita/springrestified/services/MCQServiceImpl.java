/**
 * 
 */
package fr.epita.springrestified.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epita.springrestified.dao.MCQRepository;
import fr.epita.springrestified.datamodel.MCQChoice;

/**
 * 
 * Service implementation for the mcq interface.
 * 
 * @author raaool
 *
 */
@Service
public class MCQServiceImpl implements MCQService {
	
	//TODO need to test all the service methods
	
	/** The mcq repository */
	MCQRepository mcqRepository;
	
	/** The question service **/
	QuestionService questionService;
	
	/**
	 * The constructor
	 * 
	 * @param mcqRepository The repository for mcqchoice
	 * @param questionService The service for the question objects
	 */
	@Autowired
	public MCQServiceImpl(MCQRepository mcqRepository, QuestionService questionService) {
		this.mcqRepository = mcqRepository;
		this.questionService = questionService;
	}
	

	/**
	 * @see fr.epita.springrestified.services.MCQService#getMCQChoices()
	 */
	public List<MCQChoice> getMCQChoices() {
		return mcqRepository.findAll();
	}

	/**
	 * @see fr.epita.springrestified.services.MCQService#addMCQChoice(fr.epita.springrestified.datamodel.MCQChoice)
	 */
	public List<MCQChoice> addMCQChoice(MCQChoice mcqChoice) {
		//Need to add the question first before using it to add the mcqchoice object
		questionService.addQuestion(mcqChoice.getQuestion());
		mcqRepository.save(mcqChoice);
		return getMCQChoices();
	}

	/**
	 * @see fr.epita.springrestified.services.MCQService#deleteMCQChoice(fr.epita.springrestified.datamodel.MCQChoice)
	 */
	public List<MCQChoice> deleteMCQChoice(MCQChoice mcqChoice) {
		mcqRepository.delete(mcqChoice);
		return getMCQChoices();
	}

	/**
	 * @see fr.epita.springrestified.services.MCQService#updateMCQChoice(fr.epita.springrestified.datamodel.MCQChoice)
	 */
	public boolean updateMCQChoice(MCQChoice mcqChoice) {
		
		if(mcqRepository.findById(mcqChoice.getId()).isPresent()) {
			mcqRepository.delete(mcqChoice);
			return true;
		}
		return false;
	}
}
