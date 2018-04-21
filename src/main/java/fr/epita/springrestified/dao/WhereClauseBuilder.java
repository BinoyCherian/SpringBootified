package fr.epita.springrestified.dao;


import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;


public class WhereClauseBuilder<T> {

	private Map<String, Object> parameters;
	private String queryString;

	/**
	 * @return the parameters
	 */
	public Map<String, Object> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the queryString
	 */
	public String getQueryString() {
		return queryString;
	}

	/**
	 * @param queryString
	 *            the queryString to set
	 */
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	
	/**
	 * Generic list builder.
	 * 
	 * @param entity The entity for which the list has to be prepared
	 * @return Map The map populated with the key and the values
	 */
	public Map linkedListBuilder(T entity) {

		final BeanWrapper sourceBean = new BeanWrapperImpl(entity.getClass());
		final PropertyDescriptor[] propertyDescriptors = sourceBean.getPropertyDescriptors();
		final Map<String, Object> parameters = new LinkedHashMap<>();

		for (final PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			Method method = propertyDescriptor.getReadMethod();

			try {

				Object o = method.invoke(entity);

				if (o != null && !method.getName().contains("Class")) {
					parameters.put(propertyDescriptor.getDisplayName(), o);
					System.out.println("Inserting Key: " + propertyDescriptor.getName() + " with Value: " + o);
				}

			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return parameters;
	}

}
