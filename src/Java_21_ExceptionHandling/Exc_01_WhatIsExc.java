package Java_21_ExceptionHandling;

public class Exc_01_WhatIsExc {
	
	/*
	 * WHAT IS EXCEPTION
	 * An Exception is an unwanted event that interrupts the normal flow of the program. 
	 * When an exception occurs program execution gets terminated. 
	 * In such cases we get a system generated error message.
	 */
	
	/*
	 * ADVANTAGE OF EXCEPTION
	 * Exception handling ensures that the flow of the program doesn’t break when an exception occurs.
	 */
	
	/*
	 * ERROR and EXCEPTION
	 * Errors indicate that something severe enough has gone wrong, the application should crash 
	 * rather than try to handle the error.
	 * 
	 * Exceptions are events that occurs in the code. A programmer can handle such conditions 
	 * and take necessary corrective actions. Few examples:
	 * NullPointerException
	 * ArithmeticException 
	 * ArrayIndexOutOfBoundsException
	 * 
	 */
	
	//Checked and Unchecked Exception : Compile time and runtime
	
	/*
	 * The try block contains set of statements where an exception can occur. 
	 * 
	 * A try block is always followed by a catch block, which handles the exception that occurs in 
	 * associated try block. A try block must be followed by catch blocks or finally block or both.
	 * 
       A catch block is where you handle the exceptions, this block must follow the try block. 
       A single try block can have several catch blocks associated with it. 
       You can catch different exceptions in different catch blocks.
       
       A finally block contains all the crucial statements that must be executed whether 
       exception occurs or not. The statements present in this block will always execute 
       regardless of whether exception occurs in try block or not such as closing a connection, stream etc.

       A finally block must be associated with a try block, you cannot use finally without a try block.
       Finally block is optional.

	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
