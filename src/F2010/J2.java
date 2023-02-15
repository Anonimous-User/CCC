package F2010;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String i1 = input.nextLine();
		String i2 = input.nextLine();
		String i3 = input.nextLine();
		String i4 = input.nextLine();
		String i5 = input.nextLine();
		int NF = Integer.parseInt(i1);
		int NB = Integer.parseInt(i2);
		int BF = Integer.parseInt(i3);
		int BB = Integer.parseInt(i4);
		int total = Integer.parseInt(i5);
		int NSteps = 0;
		int BSteps = 0;
		int Ntotal = 0;
		int Btotal = 0;
		while(Ntotal<total&&Btotal<total) {
			if(Ntotal<total) {
				NSteps+=NF;
				Ntotal+=NF;
			} else {
				NSteps+=(NF-(Ntotal+NF-total));
				Ntotal+=NF;
			} if(Ntotal<total) {
				NSteps-=NB;
				Ntotal+=NB;
			}else {
				NSteps-=(NF-(Ntotal+NB-total));
				Ntotal-=NB;
			}
			if(Btotal<total) {
				BSteps+=BF;
				Btotal+=BF;
			} else {
				BSteps+=(BF-(Btotal+BF-total));
				Btotal+=BF;
			} if(Btotal<total) {
				BSteps-=BB;
				Btotal+=BB;
			}else {
				BSteps-=(BF-(Ntotal+BB-total));
				Btotal-=BB;
			}
		}
		if(NSteps>BSteps) {
			System.out.println("Nikky");
		} else if(BSteps>NSteps) {
			System.out.println("Byron");
		} else {
			System.out.println("Tied");
		}
	}
}
