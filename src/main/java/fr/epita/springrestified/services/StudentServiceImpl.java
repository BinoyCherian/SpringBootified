package fr.epita.springrestified.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epita.springrestified.dao.StudentRepository;
import fr.epita.springrestified.datamodel.Student;

@Service
public class StudentServiceImpl {
	
	/** The student repository */
	StudentRepository studentRespository;
	
	@Autowired
	public StudentServiceImpl(StudentRepository studentRespository) {
		this.studentRespository = studentRespository;
	}

	/** 
	 * @see fr.epita.springrestified.services.StudentService#getStudents()
	 */
	public List<Student> getStudents() {
		return studentRespository.findAll();
	}

	/**
	 * @see fr.epita.springrestified.services.StudentService#addStudent(fr.epita.springrestified.datamodel.Student)
	 */
	public List<Student> addStudent(Student student) {
		studentRespository.save(student);
		return getStudents();
	}

	/** 
	 * @see fr.epita.springrestified.services.StudentService#deleteStudent(fr.epita.springrestified.datamodel.Student)
	 */
	public List<Student> deleteStudent(Student student) {
		studentRespository.delete(student);
		return getStudents();
	}

	/**
	 * @see fr.epita.springrestified.services.StudentService#updateStudent(fr.epita.springrestified.datamodel.Student)
	 */
	public boolean updateStudent(Student student) {
		if (studentRespository.findById(student.getId()).isPresent()) {
			studentRespository.save(student);
			return true;
		}
		return false;
	}
}
