package F2022;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int players = input.nextInt();
	    int num = 0;
	    for(int i=0; i<players; i++) {
	    	int s = input.nextInt();
	    	int f = input.nextInt();
	    	if(s*5-f*3>40) {
	    		num++;
	    	}
	    }
	    if(num==players) {
	    	System.out.println(num+"+");
	    } else {
	    	System.out.println(num);
	    }
	}
}
