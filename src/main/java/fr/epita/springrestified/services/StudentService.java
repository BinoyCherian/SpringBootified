package fr.epita.springrestified.services;

import java.util.List;

import fr.epita.springrestified.datamodel.Login;
import fr.epita.springrestified.datamodel.Student;


public interface StudentService {
	
	/**
	 * Method to get the student entities from the repository
	 * 
	 * @param student The student entity
	 * @return List<Students> The list of Student details.
	 */
	List<Student> getStudents();
	
	
	/**
	 * Method to add a student object to the repository.
	 * 
	 * @param student The student object to be added
	 * @return List of all the student objects with the new object.
	 */
	List<Student> addStudent(Student student);
	
	
	/**
	 * Method to delete a student object from the repository.
	 * 
	 * @param student The student object to be deleted
	 * @return The list of all the student objects minus the deleted object
	 */
	List<Login> deleteStudent(Student student);
	
	
	/**
	 * Method to update the student object in the repository.
	 * 
	 * @param student The student object to be updated
	 * @return TRUE/FALSE
	 */
	boolean updateStudent(Student student);

}
