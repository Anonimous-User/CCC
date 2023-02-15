package F2010;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Input = input.nextLine();
		int number = Integer.parseInt(Input);
		if(number==1||number==9||number==10) {
			System.out.println("1");
		} else if (number==2||number==3||number==7||number==8) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
	}
}
