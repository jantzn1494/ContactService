import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() throws InvalidInputException
	{
		Contact contact = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
		assertTrue(contact.getContactID().equals("0000000000"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("This address is thirty letters"));
		
		contact.setFirstName("Jane");
		contact.setLastName("Grows");
		contact.setPhone("0987654321");
		contact.setAddress("Address is under 30 chars");
		
		assertTrue(contact.getFirstName().equals("Jane"));
		assertTrue(contact.getLastName().equals("Grows"));
		assertTrue(contact.getPhone().equals("0987654321"));
		assertTrue(contact.getAddress().equals("Address is under 30 chars"));
	}
	
	@Test
	void testContactIdTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("00000000001", "John", "Doe", "1234567890", "This address is thirty letters");
		});
	}
	
	@Test
	void testContactIdNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact(null, "John", "Doe", "1234567890", "This address is thirty letters");
		});
	}
	
	@Test
	void testFirstNameTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", "Johnathan Doe", "Doe", "1234567890", "This address is thirty letters");
		});
	}
	
	@Test
	void testSetFirstNameTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
			temp.setFirstName("Johnathan Doe");
		});
	}
	
	@Test
	void testFirstNameNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", null, "Doe", "1234567890", "This address is thirty letters");
		});
	}
	
	@Test
	void testSetFirstNameNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
			temp.setFirstName(null);
		});
	}
	
	@Test
	void testLastNameTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", "John", "Johnathan Doe", "1234567890", "This address is thirty letters");
		});
	}
	
	@Test
	void testSetLastNameTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");		
			temp.setLastName("Johnathan Doe");
		});
	}
	
	@Test
	void testLastNameNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", "John", null, "1234567890", "This address is thirty letters");
		});
	}
	
	@Test
	void testSetLastNameNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
			temp.setLastName("Johnathan Doe");
		});
	}
	
	@Test
	void testPhoneTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", "John", "Doe", "12345678910", "This address is thirty letters");
		});
	}
	
	@Test
	void testSetPhoneTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
			temp.setPhone("12345678910");
		});
	}
	
	@Test
	void testPhoneNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", "John", "Doe", null, "This address is thirty letters");
		});
	}
	
	@Test
	void testSetPhoneNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
			temp.setPhone(null);
		});
	}
	
	@Test
	void testAddressTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", "John", "Doe", "1234567890", "This address is more than thirty letters");
		});
	}
	
	void testSetAddressTooLong() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
			temp.setAddress("This address is more than thirty letters");
		});
	}
	
	@Test
	void testAddressNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			new Contact("0000000000", "John", "Doe", "1234567890", null);
		});
	}
	
	@Test
	void testSetAddressNull() throws InvalidInputException
	{
		Assertions.assertThrows(InvalidInputException.class, () -> {
			Contact temp = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
			temp.setAddress(null);
		});
	}

}
