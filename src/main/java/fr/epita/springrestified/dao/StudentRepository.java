package fr.epita.springrestified.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.epita.springrestified.datamodel.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}
