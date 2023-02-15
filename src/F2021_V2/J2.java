package F2021_V2;
import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String number = input.nextLine();
	    int highest = -1;
	    String highestname = "";
	    for(int i=0; i<Integer.parseInt(number); i++) {
	    	String name = input.nextLine();
	    	String b1d = input.nextLine();
	    	int bid = Integer.parseInt(b1d);
	    	if(bid>highest) {
	    		highest = bid;
	    		highestname = name;
	    	}
	    }
	    System.out.println(highestname);
	}
}
