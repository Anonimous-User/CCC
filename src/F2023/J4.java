package F2023;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        HashMap<Integer, Boolean> r1 = new HashMap<>();
        HashMap<Integer, Boolean> r2 = new HashMap<>();

        int vert = Integer.parseInt(br.readLine());
        
        String[] input = br.readLine().split(" ");
        for(int i=0; i<vert; i++){
            if(Integer.parseInt(input[i])==1){
                r1.put(i, true);
            } else{
                r1.put(i, false);
            }
        }
        input = br.readLine().split(" ");
        for(int i=0; i<vert; i++){
            if(Integer.parseInt(input[i])==1){
                r2.put(i, true);
            } else{
                r2.put(i, false);
            }
        }
        int total=0;
        for(int i=0; i<vert; i++){
            if(r1.get(i)){
                int curcount = 3;
                if(r1.containsKey(i-1)&&r1.get(i-1)){
                    curcount--;
                }
                if(r1.containsKey(i+1)&&r1.get(i+1)){
                    curcount--;
                }
                if(i%2==0){
                    if(r2.containsKey(i)&&r2.get(i)){
                        curcount--;
                    }
                }
                total+=curcount;
            }
        }
        for(int i=0; i<vert; i++){
            if(r2.get(i)){
                int curcount = 3;
                if(r2.containsKey(i-1)&&r2.get(i-1)){
                    curcount--;
                }
                if(r2.containsKey(i+1)&&r2.get(i+1)){
                    curcount--;
                }
                if(i%2==0){
                    if(r1.containsKey(i)&&r1.get(i)){
                        curcount--;
                    }
                }
                total+=curcount;
            }
        }
        System.out.println(total);
    }
}