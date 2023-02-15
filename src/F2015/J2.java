package F2015;
import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Input = input.nextLine();
		int happy=0;
		int sad=0;
		for(int i=0; i<Input.length()-3; i++) {
			if(Input.substring(i, i+2).contentEquals(":-)")) {
				happy++;
			} if(Input.substring(i, i+2).contentEquals(":-(")) {
				sad++;
			}
		}
		if(happy>sad) {
			System.out.println("happy");
		} else if(happy<sad) {
			System.out.println("sad");
		} else if(happy==0&&sad==0){
			System.out.println("none");
		} else {
			System.out.println("unsure");
		}
	}
}
