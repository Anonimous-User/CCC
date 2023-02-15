package F2014;

import java.util.ArrayList;
import java.util.Scanner;

public class J5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numofppl = input.nextLine();
		int ppl = Integer.parseInt(numofppl);
		String list1 = input.nextLine();
		String list2 = input.nextLine();
		ArrayList<String> ln1 = new ArrayList<String>();
		ArrayList<String> ln2 = new ArrayList<String>();
		for(int i=0; i<ppl; i++) {
			ln1.add(list1.split(" ")[i]);
			ln2.add(list2.split(" ")[i]);
		}
		boolean flag = true;
		if(ppl%2==1) {
			flag=false;
		}
		while(flag&&ln1.size()>0) {
			//use indexOf instead of for loop
			for(int i=0; i<ln1.size(); i++) {
				if(ln1.get(i).equals(ln2.get(0))) {
					if(ln1.get(0).equals(ln2.get(i))) {
						ln1.remove(i);
						ln2.remove(i);
						ln1.remove(0);
						ln2.remove(0);
					} else {
						flag=false;
					}
					break;
				}
			}
		}
		if(flag) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
	}
}
