package F2021;
import java.util.Scanner;
import java.util.ArrayList;

public class J4 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        String Input = input.nextLine();
	    String[] books = Input.split("");
	    int[] book = new int[books.length];
	    for(int i=0; i<books.length; i++){
	        if(books[i].equals("L")){
	            book[i]=3;
	        } else if (books[i].equals("M")){
	            book[i]=2;
	        } else{
	            book[i]=1;
	        }
	    }
	    int count=0;
	    int numofL=0;
	    for(int i=0; i<books.length; i++){
	        if(book[i]==3){
	            numofL++;
	        }
	    }
	    for(int i=0; i<numofL; i++){
	        if(book[i]!=3){
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
