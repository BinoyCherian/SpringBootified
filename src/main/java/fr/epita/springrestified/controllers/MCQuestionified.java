package fr.epita.springrestified.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.springrestified.services.QuestionService;

/**
 * Rest controller for the project. The methods will manipulate the mcq objects from the
 * database.
 * 
 * @author raaool
 *
 */
@RestController
@RequestMapping(value="/restified/mcquestion")
public class MCQuestionified {
	
	QuestionService questionService;
	
	
	

}
