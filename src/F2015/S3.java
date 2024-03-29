package F2015;
import java.util.*;

public class S3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numGates = Integer.parseInt(in.nextLine());
        int numPlanes = Integer.parseInt(in.nextLine());
        TreeSet<Integer> docked = new TreeSet<>();
        int counter = 0;
        for (int i = 1; i <= numGates; i++){
            docked.add(i);
        }
        for (int i = 0; i < numPlanes; i++){
            int gate = Integer.parseInt(in.nextLine());
            if (docked.floor(gate) == null){
                break;
            }
            docked.remove(docked.floor(gate));
            counter++;
        }
        in.close();
        System.out.println(counter);
    }
}