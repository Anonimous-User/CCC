package F2019;

import java.util.Scanner;

public class J4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String things = input.nextLine();
		int[][] grid = new int[][]{{1, 2}, {3, 4}};
		int countH = 0;
		int countV = 0;
		for(int i=0; i<things.length(); i++) {
			if(things.substring(i, i+1).equals("H")) {
				countH++;
			} else {
				countV++;
			}
		}
		int RH = countH%2;
		int RV = countV%2;
		for(int i=0; i<RH+RV; i++) {
			int sub = 0;
			if(RV>0) {
				sub = grid[0][0];
				grid[0][0] = grid[0][1];
				grid[0][1] = sub;
				sub = grid[1][0];
				grid[1][0] = grid[1][1];
				grid[1][1] = sub;
			}
			if(RH>0) {
				sub = grid[0][0];
				grid[0][0] = grid[1][0];
				grid[1][0] = sub;
				sub = grid[0][1];
				grid[0][1] = grid[1][1];
				grid[1][1] = sub;
			}
		}
		System.out.println(grid[0][0]+" "+grid[0][1]);
		System.out.println(grid[1][0]+" "+grid[1][1]);
	}
}
