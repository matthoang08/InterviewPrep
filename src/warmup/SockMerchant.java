package warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int numberOfSocks, int[] arr) {
        
        int[] elementCounter = new int[100];
        int totalMatchingPairs = 0;
        
        for (int i=0; i < arr.length; i++) {
            int value = arr[i];
            elementCounter[value] = elementCounter[value] + 1;
        }

        System.out.println("element counter: " + Arrays.toString(elementCounter));
        
        for (int i =0; i< elementCounter.length; i++) {
            totalMatchingPairs = totalMatchingPairs + (elementCounter[i] / 2);
        }

        return totalMatchingPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int numberOfSocks = 9;
        int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

        int result = sockMerchant(numberOfSocks, arr);
        System.out.println(result);
    }
}
