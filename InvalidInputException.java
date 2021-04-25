/**
 * 
 */

/**
 * @author Nathan Jantz
 *
 */
public class InvalidInputException extends Exception
{
	/*
	 * This is a one argument constructor used to invoke super class
	 * and print out message when thrown.
	 */
	public InvalidInputException(String input)
	{
		super(input);
		System.out.println(input + " is not a valid input.");
	}
} //end InvalidInputException class
