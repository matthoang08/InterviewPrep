package arrays;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main (String args[]) {
        int[][] arr = {
            {2, 6, 8},
            {3, 5, 7},
            {1, 8, 1},
            {5, 9, 15}
        };
        int sizeOfArray = 10;

        System.out.println(arrayManipulation(sizeOfArray, arr));
    }

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long sum;
        long[] dataArray = new long[n];
        
        int lower;
        int upper;
        
        for (int i = 0; i < n; i++ ) {
            dataArray[i] = 0;
        }
        
        for ( int i=0; i < queries.length; i++) {
            lower = queries[i][0];
            upper = queries[i][1];
            sum = queries[i][2];
            dataArray[lower-1] += sum;
            if(upper < n) {
                dataArray[upper] -=sum;
            }
        }

        System.out.println(Arrays.toString(dataArray));
        
        long max = 0;
        long temp = 0;
        
        for(int i=0; i<n; i++) {
            temp += dataArray[i];
            if (temp > max) {
                max =temp;
            }
        }
        return max;
    }
}
