package F2020;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class S1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        arr.add(t);
        hm.put(t, d);
        t = scanner.nextInt();
        d = scanner.nextInt();
        if(t>arr.get(0)){
            arr.add(t);
        } else{
            arr.add(0, t);
        }
        hm.put(t, d);
        for(int i=0; i<n-2; i++){
            t = scanner.nextInt();
            d = scanner.nextInt();
            int mid = arr.size()/2;
            int min = 0;
            int max = arr.size();
            if(t>arr.get(arr.size()-1)){
                arr.add(t);
            } else if(t<arr.get(0)){
                arr.add(0, t);
            } else {
                while(min<max){
                    mid = (max+min)/2;
                    if(arr.get(mid)>t&&arr.get(mid-1)<t){
                        arr.add(mid, t);
                        break;
                    } else if(arr.get(mid)<t&&arr.get(mid+1)>t){
                        arr.add(mid+1, t);
                        break;
                    } else if(arr.get(mid-1)>t){
                        max = mid-1;
                    } else if(arr.get(mid+1)<t){
                        min = mid+1;
                    }
                }
            }
            hm.put(t, d);
        }
        double sped = 0;
        for(int i=1; i<arr.size(); i++){
            double s = Math.abs((hm.get(arr.get(i))-hm.get(arr.get(i-1)))/((double)(arr.get(i)-arr.get(i-1))));
            if(s>sped){
                sped = s;
            }
        }
        System.out.println(sped);
    }
}