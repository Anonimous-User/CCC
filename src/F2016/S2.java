package F2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        
        int questionType = Integer.parseInt(br.readLine());
        @SuppressWarnings("unused")
        int numCitizens = Integer.parseInt(br.readLine());

        String dCitizens = br.readLine();
        String pCitizens = br.readLine();

        int[] dSpeeds = Arrays.stream(dCitizens.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] pSpeeds = Arrays.stream(pCitizens.split(" ")).mapToInt(Integer::parseInt).toArray();

        //first sort from smallest to biggest
        quickSort(dSpeeds, 0, dSpeeds.length-1);
        quickSort(pSpeeds, 0, pSpeeds.length-1);

        //for max, put smallest of one with biggest of other(start of one array with end of other array)
        //for min, put biggest of one with biggest of other(start of one array with start of other array)
        int total = 0;
        switch(questionType){
            case 1:
                for(int i=0; i<dSpeeds.length; i++){
                    total += Math.max(dSpeeds[i], pSpeeds[i]);
                }
                break;
            case 2:
                for(int i=0; i<dSpeeds.length; i++){
                    total += Math.max(dSpeeds[i], pSpeeds[pSpeeds.length-1-i]);
                }
                break;
        }
        System.out.println(total);

    }

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];
 
        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
 
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
