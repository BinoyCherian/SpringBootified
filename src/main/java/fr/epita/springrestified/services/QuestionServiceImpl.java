/**
 * 
 */
package fr.epita.springrestified.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.epita.springrestified.dao.QuestionRepository;
import fr.epita.springrestified.datamodel.Question;

/**
 * The implementation class for the question service.
 * 
 * @author raaool
 *
 */
public class QuestionServiceImpl implements QuestionService {
	
	/** The question repository */
	QuestionRepository questionRespository;
	
	@Autowired
	public QuestionServiceImpl(QuestionRepository questionRespository) {
		this.questionRespository = questionRespository;
	}

	/** 
	 * @see fr.epita.springrestified.services.QuestionService#getQuestions()
	 */
	public List<Question> getQuestions() {
		return questionRespository.findAll();
	}

	/**
	 * @see fr.epita.springrestified.services.QuestionService#addQuestion(fr.epita.springrestified.datamodel.Question)
	 */
	public List<Question> addQuestion(Question question) {
		questionRespository.save(question);
		return getQuestions();
	}

	/** 
	 * @see fr.epita.springrestified.services.QuestionService#deleteQuestion(fr.epita.springrestified.datamodel.Question)
	 */
	public List<Question> deleteQuestion(Question question) {
		questionRespository.delete(question);
		return getQuestions();
	}

	/**
	 * @see fr.epita.springrestified.services.QuestionService#updateQuestion(fr.epita.springrestified.datamodel.Question)
	 */
	public boolean updateQuestion(Question question) {
		if (questionRespository.findById(question.getId()).isPresent()) {
			questionRespository.save(question);
			return true;
		}
		return false;
	}

}
