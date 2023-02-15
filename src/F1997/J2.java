package F1997;

import java.util.*;

public class J2 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int nums = Input.nextInt();
		for(int i=0; i<nums; i++) {
			int nextnum = Input.nextInt();
			ArrayList<Integer> factor = new ArrayList<Integer>();
			for(int j=0; j<nextnum/2; j++) {
				if(nextnum%(j+1)==0) {
					if(j+1!=factor.get(factor.size())) {
						factor.add(j+1);
						factor.add(nextnum/(j+1));
					}
				}
			}
			for(int f=0; f<factor.size(); f++) {
				System.out.println(factor.get(f));
			}
		}
	}
}