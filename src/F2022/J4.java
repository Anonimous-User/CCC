package F2022;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J4 {
	public static void main(String[] args) {
	    Scanner inputstring = new Scanner(System.in);
	    String togethers = inputstring.nextLine();
	    int together = Integer.parseInt(togethers);
	    String[][] c1 = new String[together][2];
	    for(int i=0; i<together; i++) {
	    	c1[i] = inputstring.nextLine().split(" ");
	    }
	   	String aways = inputstring.nextLine();
	   	int away = Integer.parseInt(aways);
	    String[][] c2 = new String[away][2];
	    for(int i=0; i<away; i++) {
	    	c2[i] = inputstring.nextLine().split(" ");
	    }
	    String in = inputstring.nextLine();
	    int ins = Integer.parseInt(in);
	    String[][] group = new String[ins][3];
	    for(int i=0; i<ins; i++) {
	    	group[i] = inputstring.nextLine().split(" ");
	    }
	    int vio = 0;
	    ArrayList<String[]> sameseen = new ArrayList<String[]>();
	    ArrayList<String[]> diffseen = new ArrayList<String[]>();
	    for(int i=0; i<ins; i++) {
	    	for(int j=0; j<together; j++) {
	    		if(!sameseen.contains(c1[j])) {
	    			if((Arrays.stream(group[i]).anyMatch(c1[j][0]::equals)&&!Arrays.stream(group[i]).anyMatch(c1[j][1]::equals))||
					(!Arrays.stream(group[i]).anyMatch(c1[j][0]::equals)&&Arrays.stream(group[i]).anyMatch(c1[j][1]::equals))){
	    				sameseen.add(c1[j]);
	    				vio++;
	    			}
	    		}
	    	}
	    	for(int j=0; j<away; j++) {
	    		if(!diffseen.contains(c2[j])) {
	    			if((Arrays.stream(group[i]).anyMatch(c2[j][0]::equals)&&Arrays.stream(group[i]).anyMatch(c2[j][1]::equals))){
	    				diffseen.add(c2[j]);
	    				vio++;
	    			}
	    		}
	    	}
	    }
	    System.out.println(vio);
	}
}
