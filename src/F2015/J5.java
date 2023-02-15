package F2015;
import java.util.Scanner;
import java.util.HashMap;

public class J5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pie = input.nextInt();
		int ppl = input.nextInt();
		HashMap used = new HashMap();
		System.out.println(recursion(pie, ppl, used));
	}
	public static int recursion(int pie, int person, HashMap useddig) {
		int count = 0;
		int numpie = pie-1;
		if(person == 1||pie==person){
			return 1;
		} else{
			while(pie-numpie<=numpie/(person-1)){
				if(!useddig.containsKey(Integer.toString(numpie))){
					count+=recursion(numpie, person-1, useddig);
					useddig.put(numpie, count);
					numpie--;
				} else {
					return (int) useddig.get(numpie);
				}
			}
		}
		return count;
	}
}