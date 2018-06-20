package fr.epita.springrestified.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.epita.springrestified.datamodel.Login;

/**
 * The interface repository to manipulate the login objects in the database.
 * 
 * @author raaool
 *
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, String>{
	
	@Query("SELECT count(*) FROM Login l where l.email = :email and l.password = :password")
	int checkLogin(@Param("email") String email, 
            @Param("password") String password);

}
