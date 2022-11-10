package collections_Vector;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {

		Queue q=new PriorityQueue();
		q.offer(65);
		q.offer(12);
		q.offer(45);
		q.offer(52);
		System.out.println(q);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		System.out.println(q);
	}

}
