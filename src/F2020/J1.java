package F2020;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int S = input.nextInt();
	    int M = input.nextInt();
	    int L = input.nextInt();
	    int total = S+2*M+3*L;
	    if(total<10) {
	    	System.out.println("sad");
	    } else {
	    	System.out.println("happy");
	    }
	}
}
