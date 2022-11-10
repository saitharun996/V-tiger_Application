package collections_Vector;

import java.util.Stack;

public class Stack_Program {

	public static void main(String[] args)
	{
		Stack s= new  Stack();
		s.add('s');
		s.push('p');
		s.add(1, 'r');
		s.push('a');
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());

	}

}
