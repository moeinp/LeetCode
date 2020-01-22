package temp;

import java.util.Arrays;

public class Temp {
	public static void main(String[] args) {
		numIslands(new int[] {0,0,0});
	}

	public static void numIslands(int[] grid) {

		System.out.println("befor" + Arrays.toString(grid));
		changeLandToWater(grid);
		System.out.println("after" + Arrays.toString(grid));
		System.out.println();

	}

	private static void changeLandToWater(int[]grid) {

		grid[1] = 1;

	}
}