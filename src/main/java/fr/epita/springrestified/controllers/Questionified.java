package fr.epita.springrestified.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.springrestified.configuration.ResponseEdo;
import fr.epita.springrestified.datamodel.Question;
import fr.epita.springrestified.services.QuestionService;

@RestController
@RequestMapping(value="/restified/question")
@CrossOrigin(origins = "http://localhost:4200")
public class Questionified {
	
	/** The question service */
	final QuestionService questionService;
	
	@Autowired
	public Questionified(QuestionService questionService) {
		this.questionService = questionService;
	}
	
	/**
	 * Method to return all the question objects from the database.
	 * 
	 * @return List<Question> The list of question json object
	 */
	@RequestMapping(method=RequestMethod.GET, value= "/questions")
	public List<Question> getQuestion() {
		return (questionService.getQuestions());
	}
	
	/**
	 * Method to add question into the repository. This method calls the underlying question service.
	 * 
	 * @param question The question object to be added to the repository
	 * @return List<Question> The list of all the question choice objects
	 */
	@RequestMapping(method=RequestMethod.POST, value="/addquestion", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean addQuestion(@RequestBody Question question){
		return true;
	}

	/**
	 * Method to delete a question object from the repository. This method calls the underlying question service.
	 * 
	 * @param question The question object to be deleted
	 * @return List<Question> The list of all the question objects after deletion
	 */
	@RequestMapping(method=RequestMethod.POST, value="/deletequestion", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEdo deleteQuestion(@RequestBody Question question){
		return new ResponseEdo(questionService.deleteQuestion(question),HttpStatus.OK);
	}
	
	/**
	 * Method to update a question object in the repository.
	 * 
	 * @param question The question object to be updated
	 * @return TRUE/FALSE
	 */
	@RequestMapping(method=RequestMethod.POST, value="/updatequestion", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEdo updateQuestion(@RequestBody Question question){
		return new ResponseEdo(questionService.updateQuestion(question),HttpStatus.OK);
	}
}
