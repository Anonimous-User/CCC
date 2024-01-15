package F2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
    
    public static void main (String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        //initializing
        int numWalls = Integer.parseInt(br.readLine());
        int[] sumWallHeights = new int[numWalls];

        //prep for calcultions
        String[] wallHeights = br.readLine().split(" ");
        for(int i=0; i<numWalls; i++){
            sumWallHeights[i] = Integer.parseInt(wallHeights[i]) + Integer.parseInt(wallHeights[i+1]);
        }

        //calculate
        double avg = 0;
        String[] wallLengths = br.readLine().split(" ");
        for(int i=0; i<numWalls; i++){
            avg += sumWallHeights[i] * Integer.parseInt(wallLengths[i]);
        }

        //end
        System.out.println(avg/2.0);
    }
}
