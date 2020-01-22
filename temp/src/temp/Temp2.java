package temp;

import java.util.Arrays;

public class Temp2 {
	public static void main(String[] args) {
		name(new int[] {0,0,0});
	}
	
	public static  void name(int[] grid) {
		System.out.println("befor" + Arrays.toString(grid));
		changeLandToWater(grid);
		System.out.println("after" + Arrays.toString(grid));
		System.out.println();
	}
	private static  void changeLandToWater(int[] x) {
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x = new int[] {1,2,3};
		
	}

}

// https://stackoverflow.com/questions/12757841/are-arrays-passed-by-value-or-passed-by-reference-in-java
