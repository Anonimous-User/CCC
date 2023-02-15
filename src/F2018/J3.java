package F2018;

import java.util.Scanner;

public class J3 {
	public static void main(String[] args) {
		int[] dis = new int[4];
		int[][] map = new int[5][5];
		Scanner input = new Scanner(System.in);
		String Input = input.nextLine();
		for(int i=0; i<4; i++) {
			dis[i] = Integer.parseInt(Input.split(" ")[i]);
		}
		map[0][0] = 0;
		map[0][1] = dis[0];
		map[0][2] = dis[0]+dis[1];
		map[0][3] = dis[0]+dis[1]+dis[2];
		map[0][4] = dis[0]+dis[1]+dis[2]+dis[3];
		map[1][0] = map[0][1];
		map[2][0] = map[0][2];
		map[3][0] = map[0][3];
		map[4][0] = map[0][4];
		for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				map[i][j] = Math.abs(map[0][j]-map[i][0]);
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
