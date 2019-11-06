package arrays;

public class JumpingOnTheClouds {
    
    public static void main (String args[]) {
        int arrSize = 6;
        int[] array = { 0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(array));
    }
    
    static int jumpingOnClouds(int[] clouds) {
        int jumps = 0;
        int i = 0;
        
        while (i < clouds.length - 1 ) {
            if ( ( (i + 2) <= clouds.length) && (clouds[i+2] != 1)) {
                i = i + 2;
            } else {
                i = i + 1;
            }
            System.out.println(i);
            jumps++;
        }
        
        return jumps;
    }
}
