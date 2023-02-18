package F2023;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J5_Without_The_BS_Directions {
    private static ArrayList<String> used = new ArrayList<String>();
    private static HashMap<Integer, Integer> oppo = new HashMap<>();
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        Scanner scanner = new Scanner(System.in);
        oppo.put(0, 4);
        oppo.put(1, 5);
        oppo.put(2, 6);
        oppo.put(3, 7);
        oppo.put(4, 0);
        oppo.put(5, 1);
        oppo.put(6, 2);
        oppo.put(7, 3);
        String find = br.readLine();
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        char[][] map = new char[r][c];
        for(int i=0; i<r; i++){
            String line = br.readLine();
            for(int j=0; j<line.length(); j+=2){
                map[i][j/2] = line.charAt(j);
            }
        }
        System.out.println(check(map, find));
    }
    public static int check(char[][] map, String find){
        int count = 0;
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                int n = 0;
                used.clear();
                n += dp(map, find, 0, i, j, 0);
                used.clear();
                n += dp(map, find, 0, i, j, 1);
                count+=n;
            }
        }
        return count;
    }
    public static int dp(char[][] map, String find, int cur, int x, int y, int dir){
        if(x<0||y<0||x>=map.length||y>=map[0].length){
            return 0;
        }
        if(used.contains(x+","+y+","+dir)){
            return 0;
        }
        if(cur==find.length()-1&&map[x][y]==find.charAt(cur)){
            return 1;
        }
        if(map[x][y]==find.charAt(cur)){
            used.add(x+","+y+","+oppo.get(dir));
            used.add(x+","+y+","+dir);
            if(dir%2==0){
                return dp(map, find, cur+1, x-1, y, 0)+dp(map, find, cur+1, x, y+1, 2)+dp(map, find, cur+1, x+1, y, 4)+dp(map, find, cur+1, x, y-1, 6);
            }
            if(dir%2==1){
                return dp(map, find, cur+1, x-1, y+1, 1)+dp(map, find, cur+1, x+1, y+1, 3)+dp(map, find, cur+1, x+1, y-1, 5)+dp(map, find, cur+1, x-1, y-1, 7);
            }
        }
        return 0;
    }
}