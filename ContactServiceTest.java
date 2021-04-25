import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ContactServiceTest {

	@Test
	void testContactServiceAddDelete() throws NotUniqueException, InvalidInputException
	{
		Contact one = new Contact("0000000000", "John", "Doe", "1234567890", "This address is thirty letters");
		Contact two = new Contact("0000000001", "Jane", "Grows", "0987654321", "Address is under 30 chars");
		
		ContactService contacts = new ContactService();
		ContactService expected = new ContactService();
		
		contacts.add(one);
		contacts.add(two);
		
		expected.add(two);
		expected.add(one);
		
		assertTrue(contacts.Find("0000000000").equals(expected.Find("0000000000")));
		assertTrue(contacts.Find("0000000001").equals(expected.Find("0000000001")));
		
		assertTrue(contacts.delete("0000000000"));
		assertFalse(contacts.delete("1"));
	}
	
	@Test
	void TestContactServiceUpdate() throws NotUniqueException, InvalidInputException
	{
		Contact one = new Contact("1", "John", "Doe", "1234567890", "This address is thirty letters");
		
		ContactService contacts = new ContactService();
		
		contacts.add(one);
		
		contacts.updateAddress("1", "address");
		contacts.updateFirstName("1", "first");
		contacts.updateLastName("1", "last");
		contacts.updatePhone("1", "phone");
		
		assertTrue(contacts.Find("1").getAddress().equals("address"));
		assertTrue(contacts.Find("1").getFirstName().equals("first"));
		assertTrue(contacts.Find("1").getLastName().equals("last"));
		assertTrue(contacts.Find("1").getPhone().equals("phone"));
	}

	@Test
	void TestContactServiceAdd() throws NotUniqueException, InvalidInputException
	{
		Contact one = new Contact("1", "John", "Doe", "1234567890", "This address is thirty letters");
		Contact two = new Contact("1", "Jane", "Grows", "0987654321", "Address is under 30 chars");
		
		ContactService contacts = new ContactService();
		contacts.add(one);
		
		Assertions.assertThrows(NotUniqueException.class, () -> {
			contacts.add(two);
		});
	}
}
