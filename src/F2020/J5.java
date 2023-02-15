package F2020;

import java.util.ArrayList;
import java.util.Scanner;

public class J5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int c = input.nextInt();
		int[][] smth = new int[r][c];
		ArrayList<Integer> cache = new ArrayList<Integer>();
		for(int i=0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				smth[i][j] = input.nextInt();
			}
		}
		boolean flag = r(1, 1, r, c, smth, cache);
		if(flag==true) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	public static boolean r(int currentr, int currentc, int endr, int endc, int[][] smth, ArrayList<Integer> cache) {
		if(currentr<=endr&&currentc<=endc) {
			if(currentr==endr&&currentc==endc) {
				return true;
			}
			if(cache.contains(smth[currentr-1][currentc-1])) {
				return false;
			}
			cache.add(smth[currentr-1][currentc-1]);
			for(int i=1; i<=smth[currentr-1][currentc-1]; i++) {
				if(smth[currentr-1][currentc-1]%i==0) {
					boolean flag = r(i, smth[currentr-1][currentc-1]/i, endr, endc, smth, cache);
					if(flag==true) {
						return true;
					}
				}
			}
			return false;
		} else {
			return false;
		}
	}
}