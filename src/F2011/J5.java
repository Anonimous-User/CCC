package F2011;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J5 {
	private static HashMap<Integer, Integer> invites = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=1; i<N; i++) {
			invites.put(i, input.nextInt());
		}
		System.out.println(r(N));
	}
	public static int r(int smth) {
		int count = Collections.frequency(invites.values(), smth);
		if(!invites.containsValue(smth)) {
			return 1;
		} else if(count==1) {
			for(int i : invites.keySet()) {
				if(invites.get(i)==smth) {
					return r(i)+1;
				}
			}
		} else {
			int f = 0;
			for(int i : invites.keySet()) {
				if(invites.get(i)==smth) {
					f+=r(i);
				}
			}
			return count*(f);
		}
		return 0;
	}
}