package Java_35_Stack;

import java.util.Stack;

public class Stack_01_Stack {

	public static void main(String[] args) {
		
		/*
		 *  The Stack data structure is based on the Last In First Out (LIFO) principle and in Java, it implements the Java List interface.
         *  The basic operations supported by a stack are push and pop.
         *  Push adds an element at the top of a stack.
		 */
		
		// Creating a Stack
	    Stack<Integer> even = new Stack<>();
	    
	    //The push() method pushes an element, that is passed as the parameter, on the top of the stack.
	    // pushing values in stack
	    even.push(0);
	    even.push(2);
	    even.push(4);
	    even.push(6);
	    even.push(8);
	    even.push(10);
	    even.push(12);
	    even.push(14);
	    even.push(16);

	    //printing the stack
	    System.out.println("Print Stack before pop:");
	    System.out.println(even);
	    
	    //The pop() method removes and returns the top element of the stack
	    // returning the number at the top of the stack and removing it
	    System.out.println("pop => " + even.pop());
	    System.out.println("pop => " + even.pop());
	    System.out.println("pop => " + even.pop());
	    //printing the stack
	    System.out.println("Print Stack after pop:");
	    System.out.println(even);
	    
	    //The peek() method returns the element on the top of the stack but does not remove it.
	    // accessing the number at the top of the stack but not removing it
	    System.out.println("Number on top of the stack is => " + even.peek());
	    
	    //The empty() method returns true if the stack is empty, otherwise, it returns false.
	    // checking if the stack is empty or not
	    System.out.println("Is stack empty?  Ans:" + even.empty());
	    
	    //The empty() method returns true if the stack is empty, otherwise, it returns false.
	    // checking the position of 8 in the stack
	    System.out.println("Position of 8 from the top is " + even.search(8));
	    // check if 20 exists in the stack
	    System.out.println("Position of 20 from the top is " + even.search(20));

	}

}
