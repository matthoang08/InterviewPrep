package warmup;

public class CountingValleys {
    
    public static void main (String args[]) {
        
        int steps = 8;
        String path = "UDDDUDUU";

        System.out.println(countingValleys(8, path));
    }
    
    static int countingValleys(int steps, String path) {
        int numberOfValleys = 0;
        int currentLevel = 0;
        boolean insideValley = false;
        
        for (int i=0; i < path.length(); i++) {
            if (path.charAt(i) == 'U' ) {
                currentLevel++;
                if (currentLevel == 0 && insideValley) {
                    numberOfValleys++;
                    System.out.println("outsideValley");
                    insideValley = false;
                }
            } else if (path.charAt(i) == 'D') {
                
                if(currentLevel == 0) {
                    System.out.println("inside valley");
                    insideValley = true;
                }
                currentLevel--;
            }
        }
        
        return numberOfValleys;
    }
}
