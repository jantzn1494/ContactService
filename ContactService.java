/**
 * ContactService class
 */

/**
 * @author Nathan Jantz
 *
 */
import java.util.HashMap;


public class ContactService {
	private HashMap<String, Contact> contacts;
	
	/*
	 * Constructor for ContactService object
	 */
	public ContactService()
	{
		contacts = new HashMap<String, Contact>();
	}
	
	/*
	 * Find method to return contact
	 */
	public Contact Find(String id) {
		return contacts.get(id);
	}
	
	/*
	 * Add method to add contact
	 * 
	 * Makes sure contact ID is unique before adding
	 */
	public void add(Contact contact) throws NotUniqueException
	{
		String id = contact.getContactID();
		if(!contacts.containsKey(id))
		{
			contacts.put(id, contact);
		}
		else
		{
			throw new NotUniqueException(id);
		}
	}
	
	/*
	 * deletes contact using contact ID as input
	 */
	public boolean delete(String id)
	{
		if (contacts.get(id) != null)
		{
			contacts.remove(id);
			return true;
		}
		return false;
	}
	
	/*
	 * updateFirstName updates the first name of a contact using contact ID and name as input
	 */
	public void updateFirstName(String id, String firstName) throws InvalidInputException
	{
		//get temp contact info
		Contact temp = contacts.get(id);
		
		//change first name
		temp.setFirstName(firstName);
		
		//update in hashmap
		contacts.remove(id);
		contacts.put(id, temp);
	}
	
	/*
	 * updateLastName updates the last name of a contact using contact ID and name as input
	 */
	public void updateLastName(String id, String lastName) throws InvalidInputException
	{
		//get temp contact info
		Contact temp = contacts.get(id);
		
		//change first name
		temp.setLastName(lastName);
		
		//update in hashmap
		contacts.remove(id);
		contacts.put(id, temp);
	}
	
	/*
	 * updatePhone updates the phone of a contact using contact ID and name as input
	 */
	public void updatePhone(String id, String phone) throws InvalidInputException
	{
		//get temp contact info
		Contact temp = contacts.get(id);
		
		//change first name
		temp.setPhone(phone);
		
		//update in hashmap
		contacts.remove(id);
		contacts.put(id, temp);
	}
	
	/*
	 * updateAddress updates the address of a contact using contact ID and name as input
	 */
	public void updateAddress(String id, String address) throws InvalidInputException
	{
		//get temp contact info
		Contact temp = contacts.get(id);
		
		//change first name
		temp.setAddress(address);
		
		//update in hashmap
		contacts.remove(id);
		contacts.put(id, temp);
	}
	
}
