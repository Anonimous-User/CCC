package F2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S2 {
    public static void main (String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        
        //initializing
        int numJerseys = Integer.parseInt(br.readLine());
        int numPlayers = Integer.parseInt(br.readLine());
        int[] jerseys = new int[3]; //[#L, #M, #S]
        Set<Integer> playerNumbers = new HashSet<Integer>(); //used numbers

        for(int i=0; i<numJerseys; i++){
            switch(br.readLine()){
                case("L"):
                    jerseys[0] = jerseys[0]+1;
                    break;
                case("M"):
                    jerseys[1] = jerseys[1]+1;
                    break;
                case("S"):
                    jerseys[2] = jerseys[2]+1;
                    break;
            }
        }

        //processing
        int count = 0;
        for(int i=0; i<numPlayers; i++){
            String pRequest = br.readLine();
            int requestedNumber = Integer.parseInt(pRequest.split("")[2]);
            if(playerNumbers.contains(requestedNumber)){
                break;
            }
            switch(pRequest.split("")[0]){
                case("L"):
                    if(jerseys[0]>0){
                        jerseys[0] = jerseys[0]-1;
                        playerNumbers.add(requestedNumber);
                        count++;
                    }
                    break;
                case("M"):
                    if(jerseys[1]>0){
                        jerseys[1] = jerseys[1]-1;
                        playerNumbers.add(requestedNumber);
                        count++;
                    }
                    break;
                case("S"):
                    if(jerseys[2]>0){
                        jerseys[2] = jerseys[2]-1;
                        playerNumbers.add(requestedNumber);
                        count++;
                    }
                    break;
            }
        }

        //end
        System.out.println(count);
    }
}
