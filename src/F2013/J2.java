package F2013;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String input = Input.nextLine();
		for(int i=0; i<input.length(); i++) {
			if(!input.substring(i, i+1).contentEquals("I")&&!input.substring(i, i+1).contentEquals("O")&&!input.substring(i, i+1).contentEquals("S")&&!input.substring(i, i+1).contentEquals("H")&&!input.substring(i, i+1).contentEquals("Z")&&!input.substring(i, i+1).contentEquals("X")&&!input.substring(i, i+1).contentEquals("N")) {
				System.out.println("NO");
				break;
			} if(i==input.length()-1) {
				System.out.println("YES");
			}
		}
	}
}