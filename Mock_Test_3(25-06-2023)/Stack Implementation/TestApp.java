package in.ineuron.Question1;

public class TestApp {

	public static void main(String[] args) {

		StackImpl s = new StackImpl(5);
		s.push(1);
		s.push(2);
		s.push(5);
		s.push(50);
		s.push(50);

		System.out.println("Popped Element " + s.pop());
		System.out.println("Is Empty " + s.isEmpty());
		System.out.println("Peek Element" + s.peek());
	}
}
