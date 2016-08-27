import java.util.*;
import java.io.*;

public class Queue {
	private LinkedList list;
	
	
	/***Queue<Integer> queue = new LinkedList<Integer>();****/

	
	
	// Queue constructor
	public Queue()
	{
		// Create a new LinkedList.
		list = new LinkedList();
	
	}

	public boolean isEmpty()
	// Post: Returns true if the queue is empty. Otherwise, false.
	{
		return (list.size() == 0);
	}

	public void enqueue(Object item)
	// Post: An item is added to the back of the queue.
	{
		// Append the item to the end of our linked list.
		list.add(item);
	}

	public Object dequeue()
	{
		Object item = list.get(1);
		list.remove(1);
		
		// Return the item
		return item;
	}

	public Object peek()
	{
		return list.get(1);
	}
}
