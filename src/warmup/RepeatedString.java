package warmup;

public class RepeatedString {
    
    public static void main (String args[]) {
        String string = "a";
        long charsToConsider = 1000000000000L;
        System.out.println(repeatedString(string, charsToConsider));
    }
    
    private static long repeatedString(String s, long n) {
        
        long a = 0;

        long numberOfRepeat = n / s.length();
        long remainder = n % s.length();
        
        for (int i=0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                a++;
            }
        }
        
        a = a * numberOfRepeat;
        
        for (int i=0; i < remainder; i ++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }
        
        return a;
    }
}
