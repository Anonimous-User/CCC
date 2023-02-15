package F2021_V2;

import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String turn = "";
	    int num = input.nextInt();
	    while(num!=99999) {
	    	if(num/1000!=0) {
    			if((num/10000+(num/1000)%10)%2==0) {
    				turn = "right";
    			} else {
    				turn = "left";
    			}
    		}
    		System.out.println(turn+" "+num%1000);
	    	num = input.nextInt();
	    }
	}
}
