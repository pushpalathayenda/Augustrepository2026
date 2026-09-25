package Collections;

import java.util.Stack;

public class StacksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack1=new Stack<String>();
		stack1.add("pushpa");
		stack1.add("Tanvi");
		stack1.add("shilpa");
		stack1.add("MahaLakshmi");
		stack1.add("prabha");
	
		int size=stack1.size();
		System.out.println(size);
		System.out.println(stack1.peek());
		int i=0;
		while( i<size)
		{
			System.out.println(stack1.pop());
			i++;
		}
		

	}

}
