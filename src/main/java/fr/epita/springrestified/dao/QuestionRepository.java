package fr.epita.springrestified.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epita.springrestified.datamodel.Question;

/**
 * The interface repository to manipulate the question objects in the database
 * 
 * @author raaool
 *
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
