package F2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S1 {
    public static void main (String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        Stack<Integer> stack = new Stack<Integer>();
        
        //initializing + processing
        int numLines = Integer.parseInt(br.readLine());
        for(int i=0; i<numLines; i++){
            stack.push(Integer.parseInt(br.readLine()));
            if(stack.peek()==0){
                stack.pop();
                stack.pop();
            }
        }

        //end
        int sum = 0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }

        System.out.println(sum);
    }
}
