package F2013;
import java.util.ArrayList;
import java.util.Scanner;

public class J5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int team = input.nextInt();
		int numplayed = input.nextInt();
		int[] scores = new int[] {0, 0, 0, 0};
		ArrayList<int[]> matches = new ArrayList<int[]>();
		matches.add(new int[] {1, 2});
		matches.add(new int[] {1, 3});
		matches.add(new int[] {1, 4});
		matches.add(new int[] {2, 3});
		matches.add(new int[] {2, 4});
		matches.add(new int[] {3, 4});
		for(int i=0; i<numplayed; i++) {
			int teama = input.nextInt();
			int teamb = input.nextInt();
			int ascore = input.nextInt();
			int bscore = input.nextInt();
			if(teama==1&&teamb==2) {
				matches.remove(0);
				if(ascore>bscore) {
					scores[0] +=3;
				} else if(ascore<bscore) {
					scores[1] +=3;
				} else {
					scores[0]++;
					scores[1]++;
				}
			} else if(teama==1&&teamb==3) {
				matches.remove(1);
				if(ascore>bscore) {
					scores[0] +=3;
				} else if(ascore<bscore) {
					scores[2] +=3;
				} else {
					scores[0]++;
					scores[2]++;
				}
			} else if(teama==1&&teamb==4) {
				matches.remove(2);
				if(ascore>bscore) {
					scores[0] +=3;
				} else if(ascore<bscore) {
					scores[3] +=3;
				} else {
					scores[0]++;
					scores[3]++;
				}
			} else if(teama==2&&teamb==3) {
				matches.remove(3);
				if(ascore>bscore) {
					scores[1] +=3;
				} else if(ascore<bscore) {
					scores[2] +=3;
				} else {
					scores[1]++;
					scores[2]++;
				}
			} else if(teama==2&&teamb==4) {
				matches.remove(4);
				if(ascore>bscore) {
					scores[1] +=3;
				} else if(ascore<bscore) {
					scores[3] +=3;
				} else {
					scores[1]++;
					scores[3]++;
				}
			} else if(teama==3&&teamb==4) {
				matches.remove(5);
				if(ascore>bscore) {
					scores[2] +=3;
				} else if(ascore<bscore) {
					scores[3] +=3;
				} else {
					scores[2]++;
					scores[3]++;
				}
			}
		}
		//use recursion instead of non stop for loop
		int count = 0;
		//num of possible alterations: 3^num of matches left
		
		int[] newscore = scores;
		//for loop from 0 to end of matches remaining
			//use newscore as scoreboard
			//if chosen team wins
				count++;
		
		
		
		//play out remaining matches
		//check score
		//reset and redo for next match
	}
}
