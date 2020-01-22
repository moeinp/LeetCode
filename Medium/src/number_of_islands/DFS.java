package number_of_islands;

public class DFS {
	public static void main(String[] args) {
		char[][] one = new char[][] { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' },
				{ '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } };
		System.out.println(numIslands(one));
		char[][] three = new char[][] { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '1', '0', '0' }, { '0', '0', '0', '1', '1' } };
		System.out.println(numIslands(three));
	}
	
	public static int numIslands(char[][] grid) {
		int numOfIslands = 0;
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					numOfIslands++;
					dfs(grid, i, j);
				}
			}
		}
		return numOfIslands;
	}

	public static void dfs(char[][] g, int i, int j) {
		if (i < 0 || i >= g.length || j < 0 || j >= g[i].length || g[i][j] == '0') {
			return;
		}
		g[i][j] = '0';
		dfs(g, i + 1, j);
		dfs(g, i - 1, j);
		dfs(g, i, j + 1);
		dfs(g, i, j - 1);

	}

}
