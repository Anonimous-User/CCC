package F2013;

import java.util.Scanner;
//code works for most(one false example is the case of 99998, returns 102349, should be 102345)
public class J3 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String year = Input.nextLine();
		int[] smth = new int[year.length()+1];
		smth[0]=-1;
		for(int i=0; i<year.length(); i++) {
			if(i==year.length()-1) {
				smth[i+1] = Integer.parseInt(year.split("")[i])+1;
			} else {
				smth[i+1] = Integer.parseInt(year.split("")[i]);
			}
		}
		for(int u=0; u<5; u++) {
			for(int i=0; i<smth.length-1; i++) {
				for(int j=i+1; j<smth.length; j++) {
					if(smth[i]==smth[j]) {
						smth[j] += 1;
					}
					for(int f=0; f<smth.length; f++) {
						if(smth[f]==10) {
							if(f-1==0) {
								smth[f]=0;
								smth[f-1]=1;
							} else {
								smth[f]=0;
								smth[f-1]+=1;
							}
						}
					}
				}
			}
		}
		if(smth[0]==-1) {
			for(int i=1; i<smth.length; i++) {
				System.out.print(smth[i]);
			}
		} else {
			for(int i=0; i<smth.length; i++) {
				System.out.print(smth[i]);
			}
		}
	}
}