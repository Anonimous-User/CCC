package F2010;

import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		for(int i=1; i>0; i++) {
			Scanner Input = new Scanner(System.in);
			String input = Input.nextLine();
			String[] thing = input.split("");
			if(thing[0].contentEquals("1")) {
				if(thing[1].contentEquals("A")) {
					a=Integer.parseInt(thing[2]);
				} else {
					b=Integer.parseInt(thing[2]);
				}
			} else if(thing[0].contentEquals("2")) {
				if(thing[1].contentEquals("A")) {
					System.out.println(a);
				} else {
					System.out.println(b);
				}
			} else if(thing[0].contentEquals("3")) {
				if(thing[1].contentEquals("A")) {
					a=a+b;
				} else {
					b=a+b;;
				}
			} else if(thing[0].contentEquals("4")) {
				if(thing[1].contentEquals("A")) {
					a=a*b;
				} else {
					b=a*b;;
				}
			} else if(thing[0].contentEquals("5")) {
				if(thing[1].contentEquals("A")) {
					a=a-b;
				} else {
					b=b-a;;
				}
			}else if(thing[0].contentEquals("6")) {
				if(thing[1].contentEquals("A")) {
					a=a/b;
				} else {
					b=b/a;
				}
			} else {
				break;
			}
		}
	}
}
