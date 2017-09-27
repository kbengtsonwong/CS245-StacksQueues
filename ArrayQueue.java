
public class ArrayQueue implements Queue {
	
	private int size, head, tail;
	private Object[] queue;
	
	// Constructor
	public ArrayQueue() {
		size = 10;
		queue = new Object[size];
		head = 0;
		tail = -1;
	}
	
	// Remove the "first" item at the head of the queue by returning it, and pointing the head to the next-in-line.
	public Object dequeue() {
		Object temp = queue[head];
		head++;
		return temp;
	}

	// Add an item to the tail of the queue, expanding the array size if necessary.
	public void enqueue(Object item) {
		
		// Increment tail to point to the new end of the queue.
		tail++;
		
		// Double the queue size if we hit the end.
		if(tail == size) {
			Object[] src = queue;
			size *= 2;
			queue = new Object[size];
			java.lang.System.arraycopy(src, 0, queue, 0, size / 2);	
		}
	
		queue[tail] = item;
	}

	// Boolean function to check if the queue is empty.
	public boolean empty() {
		return queue[head] == null;
	}
}
