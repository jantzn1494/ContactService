/**
 * Contact class
 **/

/**
 * @author Nathan Jantz
 *
 */
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/*
	 * Constructor for Contact object
	 * 
	 * Also verifies input, if input is invalid/null 
	 * then exception InvalidInputException is thrown.
	 */
	public Contact(String contactID, String firstName, String lastName, String phone, String address) throws InvalidInputException
	{
		//verify contactID and initialize, else throw exception
		if(IsValid(contactID, 10))
		{
			this.contactID = contactID;
		}
		else
		{
			throw new InvalidInputException(contactID);
		}
		
		//verify firstName and initialize, else throw exception
		if(IsValid(firstName, 10))
		{
			this.firstName = firstName;
		}
		else
		{
			throw new InvalidInputException(firstName);
		}
		
		//verify lastName and initialize, else throw exception
		if(IsValid(lastName, 10))
		{
			this.lastName = lastName;
		}
		else
		{
			throw new InvalidInputException(lastName);
		}
		
		//verify phone and initialize, else throw exception
		if(IsValid(phone, 10))
		{
			this.phone = phone;
		}
		else
		{
			throw new InvalidInputException(phone);
		}
		
		//verify address and initialize, else throw exception
		if(IsValid(address, 30))
		{
			this.address = address;
		}
		else
		{
			throw new InvalidInputException(address);
		}
	}
	
	/*
	 * This method is used for input verification and checks the following:
	 * 1. input is not null
	 * 2. input does not exceed stated size limit
	 * 
	 * arguments should be input variable to be checked and size--the character limit
	 */
	private boolean IsValid(String input, int size)
	{
		return input != null && input.length() <= size;
	}
	
	/*
	 * getter method for contactID
	 */
	public String getContactID()
	{
		return contactID;
	}
	
	/*
	 * getter and setter methods for firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName) throws InvalidInputException
	{
		//verify firstName and initialize, else throw exception
		if(IsValid(firstName, 10))
		{
			this.firstName = firstName;
		}
		else
		{
			throw new InvalidInputException(firstName);
		}
	}
	
	/*
	 * getter and setter methods for lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName) throws InvalidInputException
	{
		//verify firstName and initialize, else throw exception
		if(IsValid(lastName, 10))
		{
			this.lastName = lastName;
		}
		else
		{
			throw new InvalidInputException(lastName);
		}
	}
	
	/*
	 * getter and setter methods for phone
	 */
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone) throws InvalidInputException
	{
		//verify firstName and initialize, else throw exception
		if(IsValid(phone, 10))
		{
			this.phone = phone;
		}
		else
		{
			throw new InvalidInputException(phone);
		}
	}
	
	/*
	 * getter and setter methods for address
	 */
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address) throws InvalidInputException
	{
		//verify firstName and initialize, else throw exception
		if(IsValid(address, 30))
		{
			this.address = address;
		}
		else
		{
			throw new InvalidInputException(address);
		}
	}
	
} //end of Contact class
