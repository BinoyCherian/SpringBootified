package fr.epita.springrestified.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.epita.springrestified.datamodel.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

}
