package F2000;

import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = input.nextInt();
		int timesfirst = input.nextInt();
		int timessecond = input.nextInt();
		int timesthird = input.nextInt();
		int times = 0;
		while(total!=0) {
			if(total!=0) {
				if(timesfirst-35==0) {
					timesfirst=0;
					total+=29;
					times++;
				} else {
					total--;
					timesfirst++;
					times++;
				}
			}
			if(total!=0) {
				if(timessecond-100==0) {
					timessecond=0;
					total+=59;
					times++;
				} else {
					total--;
					timessecond++;
					times++;
				}
			}
			if(total!=0) {
				if(timesthird-10==0) {
					timesthird=0;
					total+=8;
					times++;
				} else {
					total--;
					timesthird++;
					times++;
				}
			}
		}
		System.out.println(times);
	}
}
