package fr.epita.springrestified.tests.question;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.epita.springrestified.datamodel.Question;
import fr.epita.springrestified.datamodel.QuestionType;
import fr.epita.springrestified.services.QuestionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestQuestionServiceMethods {

	@Autowired
	QuestionService questionService;
	
	@Autowired
	Question question;
	
	/**
	 * Test to check for service availablity
	 * @return 
	 */
	
	
	@Test
	public void testQuestionServiceNotNull() {
		assertNotNull(questionService);
	}
	
	/**
	 * Test to check the get service
	 */
	@Test
	public void testGetAllQuestions() {
		assertNotNull(questionService.getQuestions());
		assertTrue(questionService.getQuestions().size()>1);
	}
	
	/**
	 * Test to check the add service
	 */
	@Test
	public void testAddingAQuestionObject() {
		
		question.setQuestion("Does my question work");
		question.setType(QuestionType.OPEN);
		questionService.addQuestion(question);
		
		assertTrue(questionService.getQuestions().contains(question));
		
	}
	
	/**
	 * Test to check the update service
	 */
	@Test
	public void testUpdateQuestoionObject() {
		question.setQuestion("Does the question mean something");
		questionService.updateQuestion(question);
		
		assertTrue(questionService.getQuestions().contains(question));
	}
	
	/**
	 * Test to check for the delete service
	 */
	@Test
	public void testDeleteQuestionObject() {
		List<Question> listOfLogins = questionService.getQuestions();
		Question testObjectToBeDeleted = listOfLogins.get(0);
		questionService.deleteQuestion(testObjectToBeDeleted);
		
		assertNotEquals(listOfLogins.size(), questionService.getQuestions().size());
		assertFalse(questionService.getQuestions().contains(testObjectToBeDeleted));
	}
}

