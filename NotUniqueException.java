/**
 * NotUniqueException Class
 */

/**
 * @author Nathan Jantz
 *
 */
public class NotUniqueException extends Exception
{
	/*
	 * This is a one argument constructor used to invoke super class
	 * and print out message when thrown.
	 */
	public NotUniqueException(String input)
	{
		super(input);
		System.out.println(input + " is not a unique ID.");
	}
}//end NotUniqueException class
