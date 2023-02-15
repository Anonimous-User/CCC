package F2017;

import java.util.Scanner;

public class J4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mins = input.nextInt();
		int time = 1200;
		int count = 0;
		//total minutes in a day is 720
		int days = mins/720;
		mins = mins%720;
		for(int i=0; i<mins; i++) {
			time++;
			if(time%100==60) {
				time = (time/1000)*1000+(time%1000)/100*100+100;
			}
			if(time==1300) {
				time=100;
			}
			if(time/100==10) {
				continue;
			}
			if(time/100==11&&time==1111) {
				count++;
				continue;
			}
			if(time/100==12&&time==1234) {
				count++;
				continue;
			}
			int a = time/100;
			int b = (time%100)/10;
			int c = time%10;
			if(c-b==b-a) {
				count++;
			}
		}
		//number of arithmatic times in a day is 31
		System.out.println(days*31+count);
	}
}
