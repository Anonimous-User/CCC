package F2021;
import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
	    int kpa = 5*temp-400;
	    System.out.println(kpa);
	    if(kpa<100){
	    	System.out.println("1");
	    } else if(kpa==100){
	    	System.out.println("0");
	    } else if(kpa>100){
	        System.out.println("-1");
	    }
	}
}
