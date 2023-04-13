package F2023;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class J5_Single_Turn {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        Scanner scanner = new Scanner(System.in);
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
                if(map[i][j]==find.charAt(0)){
                    n+=dp(map, find, 1, i-1, j, 0, false);
                    n+=dp(map, find, 1, i, j+1, 2, false);
                    n+=dp(map, find, 1, i+1, j, 4, false);
                    n+=dp(map, find, 1, i, j-1, 6, false);
                    n+=dp(map, find, 1, i-1, j+1, 1, false);
                    n+=dp(map, find, 1, i+1, j+1, 3, false);
                    n+=dp(map, find, 1, i+1, j-1, 5, false);
                    n+=dp(map, find, 1, i-1, j-1, 7, false);
                }
                count+=n;
            }
        }
        return count;
    }
    public static int dp(char[][] map, String find, int cur, int x, int y, int dir, boolean turned){
        if(x<0||y<0||x>=map.length||y>=map[0].length){
            return 0;
        }
        if(cur==find.length()-1&&map[x][y]==find.charAt(cur)){
            return 1;
        }
        if(map[x][y]==find.charAt(cur)){
            if(turned){
                switch(dir){
                    case(0):
                        return dp(map, find, cur+1, x-1, y, 0, turned);
                    case(2):
                        return dp(map, find, cur+1, x, y+1, 2, turned);
                    case(4):
                        return dp(map, find, cur+1, x+1, y, 4, turned);
                    case(6):
                        return dp(map, find, cur+1, x, y-1, 6, turned);
                    case(1):
                        return dp(map, find, cur+1, x-1, y+1, 1, turned);
                    case(3):
                        return dp(map, find, cur+1, x+1, y+1, 3, turned);
                    case(5):
                        return dp(map, find, cur+1, x+1, y-1, 5, turned);
                    case(7):
                        return dp(map, find, cur+1, x-1, y-1, 7, turned);
                }
            }
            switch(dir){
                case(0):
                    return dp(map, find, cur+1, x-1, y, 0, false)+dp(map, find, cur+1, x, y+1, 2, true)+dp(map, find, cur+1, x, y-1, 6, true);
                case(2):
                    return dp(map, find, cur+1, x-1, y, 0, true)+dp(map, find, cur+1, x, y+1, 2, false)+dp(map, find, cur+1, x+1, y, 4, true);
                case(4):
                    return dp(map, find, cur+1, x, y+1, 2, true)+dp(map, find, cur+1, x+1, y, 4, false)+dp(map, find, cur+1, x, y-1, 6, true);
                case(6):
                    return dp(map, find, cur+1, x-1, y, 0, true)+dp(map, find, cur+1, x+1, y, 4, true)+dp(map, find, cur+1, x, y-1, 6, false);
                case(1):
                    return dp(map, find, cur+1, x-1, y+1, 1, false)+dp(map, find, cur+1, x+1, y+1, 3, true)+dp(map, find, cur+1, x-1, y-1, 7, true);
                case(3):
                    return dp(map, find, cur+1, x-1, y+1, 1, true)+dp(map, find, cur+1, x+1, y+1, 3, false)+dp(map, find, cur+1, x+1, y-1, 5, true);
                case(5):
                    return dp(map, find, cur+1, x+1, y+1, 3, true)+dp(map, find, cur+1, x+1, y-1, 5, false)+dp(map, find, cur+1, x-1, y-1, 7, true);
                case(7):
                    return dp(map, find, cur+1, x-1, y+1, 1, true)+dp(map, find, cur+1, x+1, y-1, 5, true)+dp(map, find, cur+1, x-1, y-1, 7, false);
            }
        }
        return 0;
    }
}