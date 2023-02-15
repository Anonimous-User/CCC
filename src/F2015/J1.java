package F2015;
import java.util.*;

public class J1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Input = input.nextLine();
		String Input2 = input.nextLine();
		int month = Integer.parseInt(Input);
		int day = Integer.parseInt(Input2);
		if(month==2&&day==18) {
			System.out.println("Special");
		} else if(month>2) {
			System.out.println("After");
		} else if(month==2&&day>18) {
			System.out.println("After");
		} else {
			System.out.println("Before");
		}
	}
}
