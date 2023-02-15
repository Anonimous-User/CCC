package F2021_V2;
import java.util.Scanner;

public class J4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String books = input.nextLine();
		int countL = 0;
		int countM = 0;
		for(int i=0; i<books.length(); i++){
			if(books.substring(i, i+1).equals("L")){
				countL++;
			} else if(books.substring(i, i+1).equals("M")){
				countM++;
			}
		}
		int unarrangedL = 0;
		int unarrangedM = 0;
		int MInL = 0;
		int LInM = 0;
		for(int i=0; i<countL; i++){
			if(!books.substring(i, i+1).equals("L")){
				unarrangedL++;
			}
			if(books.substring(i, i+1).equals("M")){
				MInL++;
			}
		}
		for(int i=countL; i<countL+countM; i++){
			if(!books.substring(i, i+1).equals("M")){
				unarrangedM++;
			}
			if(books.substring(i, i+1).equals("L")){
				LInM++;
			}
		}
		System.out.println(unarrangedL+unarrangedM-Math.min(LInM, MInL));
	}
}
