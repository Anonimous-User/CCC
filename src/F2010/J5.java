package F2010;

import java.util.Scanner;
/*
optimization
- keep track of all seen coordinates in order to eliminate duplicate pathways
- look ahead before moving to see if coordinate has been seen before
	- if seen: take the path with the least steps so far
*/

public class J5 {
	public int steps;
	/*
	public static int[][] used = new int[8][2];
	public static void setarray() {
		for(int i=0; i<used.length; i++) {
				for(int f=0; f<used[0].length; f++) {
					used[i][f]=-1;
				}
		}
	}
	*/
	/*
	public static int function(int x, int y, int endx, int endy, int steps) {
		if(x==endx&&y==endy) {
			return steps;
		} else if(x>0&&y>0&&x<9&&y<9) {
			steps++;
			//for(int i=0; i<used.length; i++) {
					//if(x-1!=used[i][0]&&y+2!=used[i][1]) {
						return function(x-1, y+2, endx, endy, steps);
					//}
			//}
			//for(int i=0; i<used.length; i++) {
					//if(x-2!=used[i][0]&&y+1!=used[i][1]) {
						return function(x-2, y+1, endx, endy, steps);
					//}
				
			//}
			//for(int i=0; i<used.length; i++) {
					//if(x-2!=used[i][0]&&y-1!=used[i][1]) {
						return function(x-2, y-1, endx, endy, steps);
					//}
				
			//}
			//for(int i=0; i<used.length; i++) {
					//if(x-1!=used[i][0]&&y-2!=used[i][1]) {
						return function(x-1, y-2, endx, endy, steps);
					//}
				
			//}
			//for(int i=0; i<used.length; i++) {
					//if(x+1!=used[i][0]&&y-2!=used[i][1]) {
						return function(x+1, y-2, endx, endy, steps);					
					//}
				
			//}
			//for(int i=0; i<used.length; i++) {
					//if(x+2!=used[i][0]&&y-1!=used[i][1]) {
						return function(x+2, y-1, endx, endy, steps);				
					//}
				
			//}
			//for(int i=0; i<used.length; i++) {
					//if(x+2!=used[i][0]&&y+1!=used[i][1]) {
						return function(x+2, y+1, endx, endy, steps);				
					//}
				
			//}
			//for(int i=0; i<used.length; i++) {
					//if(x+1!=used[i][0]&&y+2!=used[i][1]) {
						return function(x+1, y+2, endx, endy, steps);				
					//}
				
			//}
			return Integer.MAX_VALUE;
		} else {
			return Integer.MAX_VALUE;
		}
	}
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String start = input.nextLine();
		String end = input.nextLine();
		//setarray();
		//System.out.println(function(Integer.parseInt(start.substring(0, 1)), Integer.parseInt(start.substring(3, 4)), Integer.parseInt(end.substring(0, 1)), Integer.parseInt(end.substring(3, 4)), 0));
	}
}