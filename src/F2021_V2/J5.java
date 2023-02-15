package F2021_V2;

import java.util.Scanner;

public class J5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String row = input.nextLine();
		String col = input.nextLine();
		String numchange = input.nextLine();
		int[][] board = new int[Integer.parseInt(row)][Integer.parseInt(col)];
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				board[i][j] = 0;
			}
		}
		for(int i=0; i<Integer.parseInt(numchange); i++){
			String change = input.nextLine();
			if(change.substring(0, 1).equals("R")){
				int Rchange = Integer.parseInt(change.substring(2, 3));
				for(int j=0; j<board[0].length; j++){
					if(board[Rchange][j] == 1){
						board[Rchange][j] = 0;
					} else{
						board[Rchange][j] = 1;
					}
				}
			} else{
				int Cchange = Integer.parseInt(change.substring(2, 3));
				for(int j=0; j<board.length; j++){
					if(board[j][Cchange] == 1){
						board[j][Cchange] = 0;
					} else{
						board[j][Cchange] = 1;
					}
				}
			}
		}
		int count = 0;
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				if(board[i][j]==1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
