package fr.epita.datamodel;

/**
 * The enterprise object containing the customer data.
 * 
 * @author raaool
 *
 */
public class Customer {
	
	/** The customer name */
	private String customerName;
	
	/** The customer's contact name **/
	private String contactName;
	
	/** The customer's address **/
	private String address;
	
	/** The customer's city **/
	private String city;
	
	/** The customer's postal code **/
	private String postalCode;
	
	/** The customer's country **/
	private String country;
	
	
	/**
	 * Default constructor
	 */
	public Customer() {
	}
	
	/**
	 * The Parameterised constructor
	 * 
	 * @param customerName The customer name
	 * @param contactName The contact name
	 * @param address The address
	 * @param city The city
	 * @param postalCode The postal code
	 * @param country The country
	 */
	public Customer(String customerName, String contactName, String address, String city, String postalCode,
			String country) {
		this.customerName = customerName;
		this.contactName = contactName;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	
	/**
	 * Gets the customer name.
	 * 
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	
	/**
	 * Sets the customer name.
	 * 
	 * @param customerName the customer name
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/**
	 * Gets the contact name.
	 * 
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}
	
	/**
	 * Sets the contact name.
	 * 
	 * @param contactName the contact name
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	/**
	 * Gets the address.
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 * 
	 * @param address the address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Gets the city.
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 * 
	 * @param city the city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the postal code.
	 * 
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Sets the postal code.
	 * 
	 * @param postalCode the postal code
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * Gets the country.
	 * 
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * Sets the country.
	 * 
	 * @param country the country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}
