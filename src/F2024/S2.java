package F2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class S2 {
    public static int length;

    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        int[] dimensions = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        length = dimensions[1];
        
        for(int i=0; i<dimensions[0]; i++){
            String[] str = br.readLine().trim().split("");
            boolean cur = composed1(str, HOrL(str));
            if(cur){
                System.out.println("T");
            } else{
                System.out.println("F");
            }
        }
        
        // String str = br.readLine();
        // int smth = Integer.parseInt(br.readLine());
        // int[] arr = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        // Queue<Integer> queue = new LinkedList<>();
        // Stack<Integer> stack = new Stack<>();
        // ArrayList<Integer> arrList = new ArrayList<>();
        // Set<Integer> hashSet = new HashSet<>(); //random order, can store Null, faster
        // Set<Integer> treeSet = new TreeSet<>(); //sorts in order, memory efficient
        // HashMap<Integer, String> hashmap = new HashMap<>();
    }

    public static boolean composed1(String[] strings, HashMap<String, Boolean> hashMap){
        return composed2(strings, hashMap, !hashMap.get(strings[0]), 1);
    }
    public static boolean composed2(String[] strings, HashMap<String, Boolean> hashMap, boolean expectedValue, int curIndex){
        if(curIndex>=length){
            return true;
        }
        if(hashMap.get(strings[curIndex])==expectedValue){
            return composed2(strings, hashMap, !expectedValue, curIndex+1);
        }
        return false;
    }

    public static HashMap<String, Boolean> HOrL(String[] strings){
        HashMap<String, Boolean> hashmap = new HashMap<>(); //true is light, false is heavy

        for(int i=0; i<length; i++){
            if(hashmap.containsKey(strings[i])){
                hashmap.replace(strings[i], false);
            } else{
                hashmap.put(strings[i], true);
            }
        }

        return hashmap;
    }
}
