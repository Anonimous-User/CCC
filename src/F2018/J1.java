package F2018;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Input1 = input.nextInt();
		int Input2 = input.nextInt();
		int Input3 = input.nextInt();
		int Input4 = input.nextInt();
		if(Input1==8||Input1==9) {
			if(Input2==Input3) {
				if(Input4==8||Input4==9) {
					System.out.println("ignore");
				} else {
					System.out.println("answer");
				}
			} else {
				System.out.println("answer");
			}
		} else {
			System.out.println("answer");
		}
	}
}
