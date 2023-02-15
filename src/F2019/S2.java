package F2019;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class S2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ins = scanner.nextInt();
        for(int a=0; a<ins; a++){
            int num = scanner.nextInt();
            for(int i=num; i>=0; i--){
                if(isPrime(i)){
                    if(isPrime(num+num-i)){
                        System.out.println(i+" "+(num+num-i));
                        break;
                    }
                }
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}