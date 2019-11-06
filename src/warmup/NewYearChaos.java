package warmup;

public class NewYearChaos {
    public static void main (String args[]) {
        int[] input = {2, 1, 5, 3, 4};
        minimumBribes(input);
        minimumBribes( new int[] {2, 5, 1, 3, 4});
        minimumBribes( new int[] {1, 2, 5, 3, 7, 8, 6, 4});
    }

    static void minimumBribes(int[] q) {

        int bribes = 0;
        
        for (int i=0; i < q.length; i++) {
            if(q[i] > i + 3) {
                bribes = -1;
                break;
            } else if(q[i] > i + 2 ) {
                bribes = bribes + 2;
            } else if(q[i] > i + 1) {
                bribes = bribes + 1;
            }
        }
        
        if (bribes < 0) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribes);    
        }
    }
}
