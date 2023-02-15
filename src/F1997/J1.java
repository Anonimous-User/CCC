package F1997;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String numsets = Input.nextLine();
		for(int a=0; a<=Integer.parseInt(numsets); a++) {
			String numsub = Input.nextLine();
			String numv = Input.nextLine();
			String numobj = Input.nextLine();
			String[] subs = new String[Integer.parseInt(numsub)];
			String[] vs = new String[Integer.parseInt(numv)];
			String[] objs = new String[Integer.parseInt(numobj)];
			for(int i=0; i<Integer.parseInt(numsub); i++) {
				subs[i] = Input.nextLine();
			}
			for(int i=0; i<Integer.parseInt(numv); i++) {
				vs[i] = Input.nextLine();
			}
			for(int i=0; i<Integer.parseInt(numobj); i++) {
				objs[i] = Input.nextLine();
			}
			for(int i=0; i<Integer.parseInt(numsub); i++) {
				for(int j=0; j<Integer.parseInt(numv); j++){
					for(int f=0; f<Integer.parseInt(numobj); f++) {
						System.out.println(subs[i]+" "+vs[j]+" "+objs[f]+".");
					}
				}
			}
		}
	}
}