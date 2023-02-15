package F2022_Practice;

import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    int[] Sw = new int[num];
	    int[] Se = new int[num];
	    for(int i=0; i<num; i++) {
	    	Sw[i] = input.nextInt();
	    }
	    for(int i=0; i<num; i++) {
	    	Se[i] = input.nextInt();
	    }
	    int sumSw = 0;
	    int sumSe = 0;
	    boolean flag = false;
	    int days = 0;
	    for(int i=0; i<num; i++) {
	    	sumSw+=Sw[i];
	    	sumSe+=Se[i];
	    	if(sumSw==sumSe) {
	    		flag=true;
	    		days = i+1;
	    	}
	    }
	    if(flag==true) {
	    	System.out.println(days);
	    } else {
	    	System.out.println(0);
	    }
	}
}
