package arrays;

public class MinSwaps {
    
    public static void main(String args[]) {
        System.out.println(minSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
    }
    
    static int minSwaps(int[] arr) {
        int min = 0;
        int i = 0;
        
        while(i < arr.length) {
            if(arr[i] != i+1) {
                int tmp = arr[i];
                arr[i] = arr[tmp-1];
                arr[tmp-1] = tmp;       
                min++;
            } else {
                i++;
            }
        }
        
        return min;
    }
}
