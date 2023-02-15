package F2020;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int ppl = input.nextInt();
	    int infected = input.nextInt();
	    int rate = input.nextInt();
	    int infect = 0;
	    int days = 0;
	    while(infect<ppl) {
	    	infect += infected*rate;
	    	infected*=rate;
	    	days++;
	    }
	    System.out.println(days);
	}
}
