package fr.epita.springrestified.dao;

import java.util.List;
import java.util.Map.Entry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericORMDao<T> {

	@Autowired
	SessionFactory sf;
	
	public void create(T entity) {
		final Session session = sf.openSession();
		session.saveOrUpdate(entity);

	}

	public void update(T entity) {
		final Session session = sf.openSession();
		session.saveOrUpdate(entity);
	}

	public void delete(T entity) {
		final Session session = sf.openSession();
		session.delete(entity);
	}

	public List<T> search(T entity) {
		
		final Session session = sf.openSession();
		final WhereClauseBuilder<T> wcb = getWhereClauseBuilder(entity);
	
		final Query searchQuery = session.createQuery(wcb.getQueryString());
		for (final Entry<String, Object> parameterEntry : wcb.getParameters().entrySet()) {
			searchQuery.setParameter(parameterEntry.getKey(), parameterEntry.getValue());
		}

		return searchQuery.list();
	}

	protected abstract WhereClauseBuilder getWhereClauseBuilder(T entity);
}
