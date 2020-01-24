package happy_number;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(sumSquareDigits(19));
		System.out.println(sumSquareDigits(82));
		System.out.println(sumSquareDigits(68));
		System.out.println(isHappy(116));
		
	}

	public static boolean isHappy(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		Set<Integer> check = new HashSet<Integer>();
		while (n > 1) {
			if(check.contains(n)) {
				return false;
			}
			check.add(n);
			n = sumSquareDigits(n);
		}
		return true;
	}

	public static int sumSquareDigits(int n) {
		int temp = 0;
		while (n > 0) {
			temp += (n % 10) * (n % 10);
			n = n / 10;
		}
		return temp;
	}

}
