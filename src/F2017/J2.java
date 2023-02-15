package F2017;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int times = input.nextInt();
		int sum = 0;
		for(int i=0; i<=times; i++) {
			sum+=num;
			num*=10;
		}
		System.out.println(sum);
	}
}
