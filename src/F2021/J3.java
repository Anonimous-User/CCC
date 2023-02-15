package F2021;
import java.util.Scanner;
import java.util.ArrayList;

public class J3 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    ArrayList<String> things = new ArrayList<String>();
	    for(int i=1; i>0; i++){
            String Input = input.nextLine();
	        if(!Input.equals("99999")){
	            things.add(Input);
	            continue;
	        }
	        break;
	    }
	    String step="smth";
	    for(int i=0; i<things.size(); i++){
	        String substitute = things.get(i);
	        String[] substitute1 = substitute.split("");
	        int[] dissect = new int[5];
	        for(int f=0; f<5; f++){
	            int substitute2 = Integer.parseInt(substitute1[f]);
	            dissect[f] = substitute2;
	        }
	        int firsttwo = dissect[0]+dissect[1];
	        if(firsttwo!=0){
	            if(firsttwo%2==0){
	                step="right";
	            } else if(firsttwo%2!=0){
	                step="left";
	            }
	        }
	        System.out.println(step + " " + dissect[2] + dissect[3] + dissect[4]);
	    }
	}
}
