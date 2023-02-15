package F2018;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nums = input.nextLine();
		String fday = input.nextLine();
		String sday = input.nextLine();
		int spaces = Integer.parseInt(nums);
		int rep = 0;
		for(int i=0; i<spaces ; i++) {
			if(fday.substring(i, i+1).contentEquals(sday.substring(i, i+1))) {
				if(fday.substring(i, i+1).contentEquals("C")) {
					rep++;
				}
			}
		}
		System.out.println(rep);
	}
}
