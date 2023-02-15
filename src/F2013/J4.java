package F2013;

import java.util.*;

public class J4 {
	public static void main(String[] args) {
		//create arraylist, put input from lowest to highest, keep adding lowest until max
		Scanner input = new Scanner(System.in);
		int maxTime = input.nextInt();
		int numChores = input.nextInt();
		int[] chores = new int[numChores];
		for(int i=0; i<numChores; i++) {
			chores[i] = input.nextInt();
		}
		Arrays.sort(chores);
		int time = 0;
		int count = 0;
		while(time<maxTime&&count<numChores) {
			if(time+chores[count]>maxTime) {
				break;
			} else {
				time+=chores[count];
				count++;
			}
		}
		System.out.print(count);
	}
}
