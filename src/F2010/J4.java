package F2010;
import java.util.*;

public class J4 {
	public static void main(String[] args) {
		int length=0;
		ArrayList<Integer> sequence = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String Input = input.nextLine();
		String[] things = Input.split(" ");
		int[] nums = new int[things.length];
		for(int i=0; i<things.length; i++) {
			nums[i] = Integer.parseInt(things[i]);
		}
		for(int i=0; i<nums.length-1; i++) {
			sequence.add(Math.abs(nums[i+1]-nums[i]));
		}
		for(int i=0; i<sequence.size(); i++) {
			for(int j=1; j<sequence.size(); j++) {
				if(sequence.get(i)==sequence.get(j)) {
					for(int k=i; k<j; k++) {
						if(sequence.get(k)==sequence.get(j+k-i)) {
							length++;
						}
					}
					if(length==j-i) {
						System.out.println(length);
					} else {
						length=0;
					}
				}
			}
		}
	}
}
