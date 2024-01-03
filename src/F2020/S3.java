package F2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S3 {
    
    public static void main (String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        Set<String> used = new HashSet<String>();
        
        //initializing
        int[] target = new int[26];

        String targetString = br.readLine();
        for(char i : targetString.toCharArray()){
            target[i-97] += 1;
        }

        //processing
        String searchString = br.readLine();
        ArrayList<Character> curInspected = new ArrayList<>();
        int[] curInspectedChars = new int[26];
        
        for(int i=0; i<searchString.length(); i++){
            int curCharAsIndexInArray = searchString.charAt(i)-97;

            if(target[curCharAsIndexInArray]==0){ //meets a character not in target string
                curInspected.clear();
                Arrays.fill(curInspectedChars, 0);
                continue;
            }
            
            if(curInspectedChars[curCharAsIndexInArray]==target[curCharAsIndexInArray]){ //current char is maxed out in # appreances, slide start of arraylist until it fits
                while(curInspectedChars[curCharAsIndexInArray]==target[curCharAsIndexInArray]){
                    curInspectedChars[curInspected.get(0)-97] -= 1;
                    curInspected.remove(0);
                }
            }
            
            curInspected.add(searchString.charAt(i)); //add current char
            curInspectedChars[curCharAsIndexInArray] += 1;

            if(curInspected.size()==targetString.length()){ //length is not too short
                used.add(curInspected.toString()); //if new appearance, added, if not, discarded
            }
        }

        //end
        System.out.println(used.size());
    }
}
