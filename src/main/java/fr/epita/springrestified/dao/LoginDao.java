package fr.epita.springrestified.dao;

import org.springframework.beans.factory.annotation.Autowired;

import fr.epita.springrestified.datamodel.Login;

public class LoginDao extends GenericORMDao<Login>{
	
	String loginSearchQuery;
	
	@Autowired
	public LoginDao(String loginSearchQuery) {
		this.loginSearchQuery = loginSearchQuery;
	}

	@Override
	protected WhereClauseBuilder getWhereClauseBuilder(Login entity) {
		
		WhereClauseBuilder wb = new WhereClauseBuilder<Login>();
		wb.setQueryString(loginSearchQuery);
		wb.setParameters(wb.linkedListBuilder(Login.class));
		return wb;
	}

}
