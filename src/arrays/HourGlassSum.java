package arrays;

public class HourGlassSum {
    public static void main(String args[]) {
        int[][] arr = {
            { 1, 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0 }, 
            { 1, 1, 1, 0, 0, 0 },
            { 0, 0, 2, 4, 4, 0 },
            { 0, 0, 0, 2, 0, 0 },
            { 0, 0, 1, 2, 4, 0 }
        };

        System.out.println(hourglassSum(arr));
    }
    
    static int hourglassSum(int[][] arr) {
        int sum = 0;
        
        for (int i=1; i < arr.length - 1; i++) {
            for( int j=1; j < arr[i].length - 1; j++ ) {
                int hourglassSum = arr[i][j] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                
                if(i == 1 && j == 1) {
                    sum = hourglassSum;
                } else if(hourglassSum > sum) {
                    sum = hourglassSum;
                }
            }
        }
        
        return sum;
    }
}
