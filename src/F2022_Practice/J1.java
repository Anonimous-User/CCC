package F2022_Practice;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    int count = 0;
	    int right = 0;
	    int left = 0;
	    if(num<=5) {
	    	left = num;
	    } else {
	    	left = 5;
	    	right = num-5;
	    }
	    while(left>=right) {
	    	count++;
	    	left--;
	    	right++;
	    }
	    System.out.println(count);
	}
}
