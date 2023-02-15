package F2020;

import java.util.Scanner;

public class J4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String str = input.nextLine();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(!text.contains(str)) {
				str = str.substring(1)+str.substring(0, 1);
				count++;
				break;
			}
		}
		if(count==str.length()) {
			System.out.println("no");
		} else {
			System.out.println("yes");
		}
	}
}
