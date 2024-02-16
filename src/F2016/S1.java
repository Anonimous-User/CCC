package F2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class S1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        String sample = br.readLine();
        HashMap<String, Integer> chars = new HashMap<>();

        for(String c : sample.split("")){
            if(chars.containsKey(c)){
                chars.replace(c, chars.get(c)+1);
            } else{
                chars.put(c, 1);
            }
        }

        String anagram = br.readLine();
        int unknown = 0;
        for(String c : anagram.split("")){
            if(c.equals("*")){
                unknown += 1;
                continue;
            } else if(chars.containsKey(c)){
                chars.replace(c, chars.get(c)-1);
                if(chars.get(c)==0){
                    chars.remove(c);
                }
            } else{
                System.out.println("N");
                return;
            }
        }

        int unused = 0;
        for(String k : chars.keySet()){
            unused += chars.get(k);
        }

        if(unused==unknown){
            System.out.println("A");
        } else{
            System.out.println("N");
        }
    }
}
