package temp;

import java.awt.List;
import java.util.ArrayList;


public class Sample {
	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		A.next = new ListNode(2);
		A.next.next = new ListNode(4);

		
		System.out.println(A.val);
	}
}
