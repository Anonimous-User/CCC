package F2020;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class S2 {
	static Set<Integer> vals = new HashSet<Integer>();//keep track of all values
	static HashMap<Integer, Set<Integer>> used = new HashMap<Integer, Set<Integer>>();//used values
    static HashMap<Integer, ArrayList<int[]>> hm = new HashMap<Integer, ArrayList<int[]>>();//keep track of indexes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
		 * go from exit
		 * use set to check if matrix contains the value needed to exit
		 * have this one as exit
		 */
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				int value = scanner.nextInt();
				if(vals.contains(value)){
					ArrayList<int[]> sub = hm.get(value);
					int[] subs = new int[]{i, j};
					sub.add(subs);
					hm.replace(value, sub);
				} else{
					vals.add(value);
					ArrayList<int[]> sub = new ArrayList<int[]>();
					int[] subs = new int[]{i, j};
					sub.add(subs);
					hm.put(value, sub);
				}
			}
		}
		if(check(r*c)){
			System.out.println("yes");
		} else{
			System.out.println("no");
		}
    }
	public static boolean check(int target){
		if(vals.contains(target)){
			for(int i=0; i<hm.get(target).size(); i++){
				int x = hm.get(target).get(i)[0];
				int y = hm.get(target).get(i)[1];
				if(x==0&&y==0){
					return true;
				}
				if(used.containsKey(x)){
					if(used.get(x).contains(y)){
						return false;
					}
				}
				if(used.containsKey(x)){
					used.get(x).add(y);
				} else{
					used.put(x, new HashSet<Integer>());
					used.get(x).add(y);
				}
				int valueNeeded = (x+1)*(y+1);
				if(check(valueNeeded)){
					return true;
				}
			}
		}
		return false;
	}
}