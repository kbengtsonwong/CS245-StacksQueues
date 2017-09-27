public class ArrayStack implements Stack{
	
	private Object[] stack;
	private int size, pointer;
	
	// Constructor, initializes a Stack of size 10.
	public ArrayStack() {
		size = 10;
		pointer = -1;
		stack = new Object[size];
	}
	
	// Push an item to the top of a stack, which is one spot above the current pointer. 
	public void push(Object item) {
		pointer++;
		if(pointer == size) {
			// Doubles the current size of the array if an attempt is made to exceed the size of the array.
			Object[] src = stack;
			size *= 2;
			stack = new Object[size];
			java.lang.System.arraycopy(src, 0, stack, 0, size / 2);	
		}
		stack[pointer] = item;
	}

	// Pop the top element of the stack, clearing it and returning the object.
	public Object pop() {
		Object temp = stack[pointer];
		stack[pointer] = null;
		pointer = pointer - 1;
		return temp;
	}
	
	// Examine the current top element of the stack.
	public Object peek() {
		return stack[pointer];
	}

	// Boolean function to check if the stack is empty.
	public boolean empty() {
		return stack[0] == null;
	}
	
}
