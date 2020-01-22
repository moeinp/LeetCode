package add_two_numbers;

public class ReverseOrder {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode l3 = addTwoNumbers(l1, l2);
		while (l3 != null) {
			System.out.print(l3.val + " --> ");
			l3 = l3.next;
		}
		System.out.println("null");

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode l3 = dummy;
		int carry = 0;
		while (l1 != null && l2 != null) {
			l3.next = new ListNode((l1.val + l2.val + carry) % 10);
			carry = (l1.val + l2.val + carry) / 10;
			l3 = l3.next;
			l2 = l2.next;
			l1 = l1.next;
		}
		while (l1 != null) {
			l3.next = new ListNode((l1.val + carry) % 10);
			carry = (l1.val + carry) / 10;
			l3 = l3.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			l3.next = new ListNode((l2.val + carry) % 10);
			carry = (l2.val + carry) / 10;
			l3 = l3.next;
			l2 = l2.next;
		}
		if (carry == 1) {
			l3.next = new ListNode(1);
		}

		return dummy.next;

	}

}
