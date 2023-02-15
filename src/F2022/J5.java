package F2022;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class J5 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sizes = input.nextLine();
	    int size = Integer.parseInt(sizes);
	    String nums = input.nextLine();
	    int num = Integer.parseInt(nums);
	    /*
	    int[][] coords = new int[num][2];
	    int largest = 0;
	    for(int i=0; i<num; i++) {
	    	String in = input.nextLine();
	    	coords[i][0] = Integer.parseInt(in.split(" ")[0]);
	    	coords[i][1] = Integer.parseInt(in.split(" ")[1]);
	    }
	    for(int i=0; i<size; i++) {
	    	int origr = i;
	    	int origc = 0;
	    	for(int j=0; j<size; j++) {
	    		if()
	    	}
	    }
	    */
	    int[][] grid = new int[size][size];
	    for(int i=0; i<size; i++) {
	    	for(int j=0; j<size; j++) {
	    		grid[i][j] = 1;
	    	}
	    }
	    for(int i=0; i<num; i++) {
	    	String in = input.nextLine();
	    	int r = Integer.parseInt(in.split(" ")[0]);
	    	int c = Integer.parseInt(in.split(" ")[1]);
	    	grid[r-1][c-1] = 0;
	    }
	    int max = 0;
	    int[][] test = new int[size+1][size+1];
	    for (int i = 1 ; i <= size; i++) {
	      for (int j = 1; j <= size; j++) {
	        if(grid[i-1][j-1] == 1) {
	          test[i][j] = Math.min(Math.min(test[i][j-1] , test[i-1][j-1]), test[i-1][j]) + 1;
	          max = Math.max(test[i][j], max);
	        }
	      }
	    }
	    System.out.println(max);
	}
}
