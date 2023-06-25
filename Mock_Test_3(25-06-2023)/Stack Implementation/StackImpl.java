package in.ineuron.Question1;

public class StackImpl {

	private int max_size;
	private int[] arr = null;
	private int top = -1;

	public StackImpl(int size) {
		this.max_size = size;
		arr = new int[size];
	}

	public int push(int ele) {
		if (top != max_size - 1) {
			arr[++top] = ele;
			return ele;
		}
		throw new RuntimeException("Stack is Full");
	}

	public int pop() {
		if (top == -1)
			throw new RuntimeException("Empty Stack");
		else {
			return arr[top--];
		}
	}

	public int peek() {
		if (top == -1)
			throw new RuntimeException("Empty Stack");
		else
			return arr[top];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

}
