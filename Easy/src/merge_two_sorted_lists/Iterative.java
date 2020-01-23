package merge_two_sorted_lists;

public class Iterative {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = mergeTwoLists(l1, l2);
		while (l3 != null) {
			System.out.print(l3.val + " --> ");
			l3 = l3.next;
		}
		System.out.println("null");
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode merged = new ListNode(0);
		ListNode temp = merged;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		while (l1 != null) {
			temp.next = l1;
			temp = temp.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			temp.next = l2;
			temp = temp.next;
			l2 = l2.next;
		}
		return merged.next;
	}
}
