package fr.epita.springrestified.dao;

import javax.inject.Inject;

import fr.epita.springrestified.datamodel.Login;

public class LoginDao extends GenericORMDao<Login>{
	
	@Inject
	String loginSearchQuery;

	@Override
	protected WhereClauseBuilder getWhereClauseBuilder(Login entity) {
		
		WhereClauseBuilder wb = new WhereClauseBuilder<Login>();
		wb.setQueryString(loginSearchQuery);
		wb.setParameters(wb.linkedListBuilder(Login.class));
		return wb;
	}

}
