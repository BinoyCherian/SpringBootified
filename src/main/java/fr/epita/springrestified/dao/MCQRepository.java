package fr.epita.springrestified.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.epita.springrestified.datamodel.MCQChoice;

/**
 * The interface repository to manipulate the MCQChoice objects
 * 
 * @author raaool
 *
 */
@Repository
public interface MCQRepository extends JpaRepository<MCQChoice, Integer> {

}
