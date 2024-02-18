package queueInterface;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length());
	}
	
	
}

public class Example {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		
		
		queue.addAll(List.of("Apple" ,"Zebra" , "Monkey" , "Dog" , "Wonderful" ));
		queue.offer("Cat");
		
		
		
		System.out.println(queue.poll());  //FIFO
		System.out.println(queue.poll());  //FIFO
		System.out.println(queue.poll());  //FIFO
		System.out.println(queue.poll());  //FIFO
		System.out.println(queue.poll());  //FIFO
		System.out.println(queue.poll());  //FIFO
		
		System.out.println(queue);

	}

}
