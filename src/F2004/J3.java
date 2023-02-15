package F2004;
import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numadj = input.nextLine();
		String numnoun = input.nextLine();
		String[] adj = new String[Integer.parseInt(numadj)];
		String[] noun = new String[Integer.parseInt(numnoun)];
		for(int i=0; i<adj.length; i++) {
			adj[i] = input.nextLine();
		} 
		for(int i=0; i<noun.length; i++) {
			noun[i] = input.nextLine();
		}
		for(int i=0; i<adj.length; i++) {
			for(int j=0; j<noun.length; j++) {
				System.out.println(adj[i]+" as "+noun[j]);
			}
		}
	}
}
