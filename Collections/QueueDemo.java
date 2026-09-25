package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que=new LinkedList<String>();
		que.add("Pushpa");
		que.add("Tanvi");
		que.add("Shilpa");
		que.add("Shilpa");
		que.add("MahaLashki");
		que.add("Minakshi");
		System.out.println(que.peek());
		System.out.println(que.poll());
		int size=que.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(que.poll());
		}
//que.peek Retrieves  top element of queue.
		//que.poll retrieves and removes the first element so
		//so automaticall size reduces when item removes.
		//we use another varibale to store size of queue.
	}

}
