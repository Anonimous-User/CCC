package F2021;
import java.util.Scanner;
import java.util.ArrayList;

public class J5 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String ROWS = input.nextLine();
	    String COLUMN = input.nextLine();
	    int rows = Integer.parseInt(ROWS);
	    int column = Integer.parseInt(COLUMN);
	    int[][] grid = new int[rows][column];
	    String Input = input.nextLine();
	    int INPUT = Integer.parseInt(Input);
	    for(int i=0; i<INPUT; i++){
	        String changes = input.nextLine();
	        String CorR = changes.split(" ")[0];
	        String num = changes.split(" ")[1];
	        int number = Integer.parseInt(num);
	        if(CorR.equals("C")){
	            for(int j=0; j<rows; j++){
	                if(grid[j][number-1]==0){
	                    grid[j][number-1]=1;
	                } else if(grid[j][number-1]==1){
	                    grid[j][number-1]=0;
	                }
	            }
	        }
	        if(CorR.equals("R")){
	            for(int j=0; j<column; j++){
	                if(grid[number-1][j]==0){
	                    grid[number-1][j]=1;
	                } else if(grid[number-1][j]==1){
	                    grid[number-1][j]=0;
	                }
	            }
	        }
	    }
	    int count=0;
	    for(int i=0; i<rows; i++){
	        for(int j=0; j<column; j++){
	            if(grid[i][j]==1){
	                count++;
	            }
	        }
	    }
	    System.out.println(count);
	}
}
