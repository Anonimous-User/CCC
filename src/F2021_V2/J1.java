package F2021_V2;
import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int temp = input.nextInt();
	    String sealvl = "";
	    temp = 5*temp-400;
	    if(temp == 100) {
	    	sealvl = "0";
	    } else if(temp<100) {
	    	sealvl = "1";
	    } else {
	    	sealvl = "-1";
	    }
	    System.out.println(temp);
	    System.out.println(sealvl);
	}
}
