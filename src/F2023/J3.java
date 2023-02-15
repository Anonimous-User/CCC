package F2023;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        Scanner scanner = new Scanner(System.in);
        int ppl = Integer.parseInt(br.readLine());
        int[] attendable = new int[5];
        for(int i=0; i<ppl; i++){
            String available = br.readLine();
            for(int j=0; j<available.length(); j++){
                if(available.charAt(j)=='Y'){
                    attendable[j]++;
                }
            }
        }
        ArrayList<Integer> come = new ArrayList<Integer>();
        int biggest = attendable[0];
        for(int i=0; i<attendable.length; i++){
            if(attendable[i]>biggest){
                come.clear();
                come.add(i);
                biggest = attendable[i];
            } else if(attendable[i]==biggest){
                come.add(i);
            }
        }
        while(come.size()!=1){
            System.out.print(come.get(0)+1+",");
            come.remove(0);
        }
        System.out.print(come.get(0)+1);
    }
}
