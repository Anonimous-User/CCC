package F2022_Practice;

import java.util.HashMap;
import java.util.Scanner;
//wrong, doesn't solve for largest gap
public class S3 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
	    for(int i=0; i<num; i++) {
	    	int in = input.nextInt();
	    	if(nums.containsKey(in)) {
	    		nums.replace(in, nums.get(in)+1);
	    	} else {
	    		nums.put(in, 1);
	    	}
	    }
	    int most = 0;
	    int least = 0;
	    for(int i : nums.keySet()) {
	    	most = i;
	    	least = i;
	    	break;
	    }
	    for(int i : nums.keySet()) {
	    	if(nums.get(i)>=nums.get(most)) {
	    		if(nums.get(i)>nums.get(most)) {
	    			most = i;
	    		} else {
	    			most = Math.max(i, most);
	    		}
	    	} if(nums.get(i)<=nums.get(least)) {
	    		if(nums.get(i)<nums.get(least)) {
	    			least = i;
	    		} else {
	    			least = Math.min(i, least);
	    		}
	    	}
	    }
	    System.out.println(most);
	    System.out.println(least);
	    System.out.println(Math.abs(most-least));
	}
}
