package fr.epita.springrestified.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.epita.springrestified.datamodel.Question;

/**
 * The interface repository to manipulate the question objects in the database
 * 
 * @author raaool
 *
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
