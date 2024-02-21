package F2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        int numPpl = Integer.parseInt(br.readLine());
        
        int[] numbers = new int[numPpl];

        for(int i=0; i<numPpl/2; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i=0; i<numPpl/2; i++){
            int curNum = Integer.parseInt(br.readLine());
            if(curNum==numbers[i]){
                count+=2;
            }
        }

        System.out.println(count);
    }
}
