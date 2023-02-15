package F2022;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String in = input.nextLine();
	    ArrayList<String> instr = new ArrayList<String>();
	    int start = 0;
	    for(int i=0; i<in.length(); i++) {
	    	if(i==in.length()-1) {
	    		instr.add(in.substring(start, i+1));
	    	} else if(IsInt(in.substring(i, i+1))&&!(IsInt(in.substring(i+1, i+2)))){
	    		instr.add(in.substring(start, i+1));
	    		start = i+1;
	    	}
	    }
	    for(int i=0; i<instr.size(); i++) {
	    	int sign = 0;
	    	for(int j=0; j<instr.get(i).length(); j++) {
	    		if(instr.get(i).substring(j, j+1).equals("+")) {
	    			System.out.println(instr.get(i).substring(0, j)+" tighten "+instr.get(i).substring(j+1));
	    			break;
	    		} else if(instr.get(i).substring(j, j+1).equals("-")) {
	    			System.out.println(instr.get(i).substring(0, j)+" loosen "+instr.get(i).substring(j+1));
	    			break;
	    		}
	    	}
	    }
	}
	public static boolean IsInt(String in) {
	    try { 
	        Integer.parseInt(in); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    return true;
	}
}
