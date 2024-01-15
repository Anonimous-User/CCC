package F2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2 {
    public static void main (String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        //initializing
        int rows = Integer.parseInt(br.readLine());
        int cols = Integer.parseInt(br.readLine());
        boolean[] r = new boolean[rows];
        boolean[] c = new boolean[cols];

        //processing
        int numMoves = Integer.parseInt(br.readLine());
        for(int i=0; i<numMoves; i++){
            String[] move = br.readLine().split(" ");
            switch(move[0]){
                case "R":
                    r[Integer.parseInt(move[1])-1] = !r[Integer.parseInt(move[1])-1];   //changes to true if previously false, vice versa.
                                                                                        //Keeps track of which column/row has been flipped and unflipped
                    break;
                case "C":
                    c[Integer.parseInt(move[1])-1] = !c[Integer.parseInt(move[1])-1];
                    break;
            }
        }

        //end
        int count = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(r[i]^c[j]){  //returns true if its row is flipped(true) but column is not(false), vice versa
                                //If both are flipped(true) or both are unflipped(false), returns false
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
