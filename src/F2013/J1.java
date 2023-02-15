package F2013;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int difference=num2-num1;
		int next=difference+num2;
		System.out.println(next);
	}
}
