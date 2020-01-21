package add_two_numbers_2;

public class NonReversedOrder {
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
		int l1Temp = 0;
		while (l1 != null) {
			l1Temp *= 10;
			l1Temp = l1Temp + l1.val;
			l1 = l1.next;
		}
		int l2Temp = 0;
		while (l2 != null) {
			l2Temp *= 10;
			l2Temp = l2Temp + l2.val;
			l2 = l2.next;
		}
		int l3 = l1Temp + l2Temp;
		int l4 = 0;
		while (l3 > 0) {
			l4 = l4 * 10;
			l4 = l4 + l3 % 10;
			l3 = l3 / 10;
		}
		ListNode dummy = new ListNode(0);
		ListNode ans = dummy;
		while (l4 != 0) {
			ans.next = new ListNode(l4%10);
			ans = ans.next;
			l4 = l4 / 10;
		}
		return dummy.next;
	}

}
