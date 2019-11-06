package dictionaries;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static void main(String args[]) {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
    }
    
    static String twoStrings(String s1, String s2) {
        Set<Character> charSet = new HashSet<>();
        
        for(int i=0; i<s1.length(); i++) {
            charSet.add(s1.charAt(i));
        }
        
        for(int j=0; j<s2.length(); j++) {
            if(charSet.contains(s2.charAt(j))) {
                return "YES";
            }
        }
        
        return "NO";
    }
}
