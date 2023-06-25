package in.ineuron.Question2;

public class QueueImpl {

	private ListNode head;
	private ListNode prev;

	public QueueImpl() {
	}

	public int enqueue(int val) {

		ListNode temp = new ListNode(val);
		if (head == null) {
			head = temp;
			prev = head;
		} else {
			prev.next = temp;
			prev = temp;
		}

		return val;

	}

	public int dequeu() {
		if (head == null)
			throw new RuntimeException("Queue is Empty");
		else if (head.next == null) {
			int v = head.val;
			head = null;
			return v;
		} else {
			int v = head.val;
			head = head.next;
			return v;
		}
	}

	public int peek() {
		if (head == null)
			throw new RuntimeException("Queue is Empty");
		else {
			return prev.val;
		}

	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public static class ListNode {
		int val;
		ListNode next;

		public ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

}