package in.ineuron;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * Example 1:
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8] Explanation: 342 + 465 =
 * 807.
 * 
 * Example 2:
 * 
 * Input: l1 = [0], l2 = [0] Output: [0]
 * 
 * Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
 * 
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in each linked list is in the range [1, 100]. 0 <=
 * Node.val <= 9 It is guaranteed that the list represents a number that does
 * not have leading zeros.
 * 
 */
public class AddTwoLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(9);
		ListNode l3 = new ListNode(9);
		ListNode l4 = new ListNode(9);
		ListNode l5 = new ListNode(9);
		ListNode l6 = new ListNode(9);
		ListNode l7 = new ListNode(9);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;

		ListNode l8 = new ListNode(9);
		ListNode l9 = new ListNode(9);
		ListNode l10 = new ListNode(9);
		ListNode l11 = new ListNode(9);

		l8.next = l9;
		l9.next = l10;
		l10.next = l11;

		ListNode res = reverseAndAddList(l1, l8);

		System.out.println("Result is");
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}

	}

	public static ListNode reverseAndAddList(ListNode l1, ListNode l2) {

		// Reversing the Linked List
		ListNode prev1 = null;
		while (l1 != null) {

			ListNode temp = l1.next;

			l1.next = prev1;

			prev1 = l1;
			l1 = temp;
		}

		ListNode prev2 = null;
		while (l2 != null) {

			ListNode temp = l2.next;

			l2.next = prev2;

			prev2 = l2;
			l2 = temp;
		}

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		int carry = 0;

		// Performing the Addition Operation
		while (prev1 != null || prev2 != null) {
			int x = prev1 != null ? prev1.val : 0;
			int y = prev2 != null ? prev2.val : 0;

			int sum = x + y + carry;

			carry = sum / 10;
			current.next = new ListNode(sum % 10);

			current = current.next;

			if (prev1 != null)
				prev1 = prev1.next;
			if (prev2 != null)
				prev2 = prev2.next;
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}

		return dummy.next;
	}

}
