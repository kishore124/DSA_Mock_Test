package in.ineuron.Question2;

import in.ineuron.Question2.QueueImpl.ListNode;

public class TestApp {

	public static void main(String[] args) {

		QueueImpl q = new QueueImpl();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeu();
		q.dequeu();
		q.enqueue(7);
		q.enqueue(9);

		ListNode h = q.getHead();

		System.out.println("Queue Data");
		while (h != null) {
			System.out.print(h.val + " ");
			h = h.next;
		}
		System.out.println();

		System.out.println("IS empty " + q.isEmpty());
		System.out.println("Peek Element " + q.peek());
	}

}
