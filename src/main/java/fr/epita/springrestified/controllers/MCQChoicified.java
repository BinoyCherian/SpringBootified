package fr.epita.springrestified.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.springrestified.datamodel.MCQChoice;
import fr.epita.springrestified.services.MCQService;

/**
 * Rest controller for the project. The methods will manipulate the mcq objects from the
 * database.
 * 
 * @author raaool
 *
 */
@RestController
@RequestMapping(value="/restified/mcqchoice")
@CrossOrigin(origins = "http://localhost:4200")
public class MCQChoicified {
	
	/** The mcq service */
	final MCQService mcqService;
	
	/**
	 * Constructor
	 * 
	 * @param mcqService The mcq service
	 */
	@Autowired
	public MCQChoicified(MCQService mcqService) {
		this.mcqService = mcqService;
	}
	
	/**
	 * Method to return all the mcq objects from the database.
	 * 
	 * @return List<MCQChoice> The list of mcqchoice json object
	 */
	@RequestMapping(method=RequestMethod.GET, value= "/mcqs")
	public List<MCQChoice> getMcqs() {
		return mcqService.getMCQChoices();
	}
	
	/**
	 * Method to add mcq into the repository. This method calls the underlying mcq service.
	 * 
	 * @param mcqChoice The mcq object to be added to the repository
	 * @return List<MCQChoice> The list of all the mcq choice objects
	 */
	@RequestMapping(method=RequestMethod.POST, value="/addmcq", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<MCQChoice> addMcq(@RequestBody MCQChoice mcqChoice){
		return mcqService.addMCQChoice(mcqChoice);
	}

	/**
	 * Method to delete a mcq object from the repository. This method calls the underlying mcq service.
	 * 
	 * @param mcqChoice The mcq object to be deleted
	 * @return List<MCQChoice> The list of all the mcq objects after deletion
	 */
	@RequestMapping(method=RequestMethod.POST, value="/deletemcq", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<MCQChoice> deleteMcq(@RequestBody MCQChoice mcqChoice){
		return mcqService.deleteMCQChoice(mcqChoice);
	}
	
	/**
	 * Method to update a mcq object in the repository.
	 * 
	 * @param mcqChoice The mcq object to be updated
	 * @return TRUE/FALSE
	 */
	@RequestMapping(method=RequestMethod.POST, value="/updatemcq", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateMcq(@RequestBody MCQChoice mcqChoice){
		return mcqService.updateMCQChoice(mcqChoice);
	}
}
