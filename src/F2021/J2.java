package F2021;
import java.util.Scanner;
//could use hashmap
public class J2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        String Input = input.nextLine();
	    int thing = Integer.parseInt(Input);
	    int[] money = new int[thing];
	    String[] people = new String[thing];
	    for(int i=0; i<thing; i++){
	        String person = input.nextLine();
	        String valu3 = input.nextLine();
	        int value = Integer.parseInt(valu3);
	        money[i]=value;
	        people[i]=person;
	    }
	    int highest=money[0];
	    for(int i=1; i<thing; i++){
	        if(money[i]>highest){
	            highest=money[i];
	        }
	    }
	    int place=0;
	    for(int i=0; i<thing; i++){
	        if(money[i]==highest){
	            place=i;
	        }
	    }
	    System.out.println(people[place]);
	}
}
