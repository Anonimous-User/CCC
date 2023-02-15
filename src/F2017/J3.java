package F2017;

import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startx = input.nextInt();
		int starty = input.nextInt();
		int endx = input.nextInt();
		int endy = input.nextInt();
		int steps = input.nextInt();
		int dis = Math.abs(startx-endx)+Math.abs(starty-endy);
		if(dis%2==0&&steps%2==0) {
			System.out.println("Y");
		} else if(dis%2!=0&&steps%2!=0) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
	}
}
