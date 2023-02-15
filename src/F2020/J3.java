package F2020;

import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String numinput = input.nextLine();
	    int numin = Integer.parseInt(numinput);
	    int xmin = 100;
	    int xmax = 0;
	    int ymin = 100;
	    int ymax = 0;
	    for(int i=0; i<numin; i++) {
	    	String coords = input.nextLine();
	    	int xin = Integer.parseInt(coords.substring(0, coords.indexOf(",")));
	    	int yin = Integer.parseInt(coords.substring(coords.indexOf(",")+1));
	    	if(xmin>xin) {
	    		xmin=xin;
	    	}
	    	if(xmax<xin) {
	    		xmax=xin;
	    	}
	    	if(ymin>yin) {
	    		ymin=yin;
	    	}
	    	if(ymax<yin) {
	    		ymax=yin;
	    	}
	    }
	    System.out.println((xmin-1)+", "+(ymin-1));
	    System.out.println((xmax+1)+", "+(ymax+1));
	}
}
