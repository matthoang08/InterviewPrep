package dictionaries;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main (String args[]) {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "me", "one", "grand", "today"};
        checkMagazine(magazine, note);
    }
    
    static void checkMagazine(String[] magazine, String[] note) {
        
        boolean printable = true;

        Map<String, Integer> dictionary = new HashMap<>();

        for(int i=0; i<magazine.length; i++) {
            if(dictionary.containsKey(magazine[i])) {
                dictionary.put(magazine[i], (dictionary.get(magazine[i]) + 1));
            } else {
                dictionary.put(magazine[i], 1);
            }
        }

        for(int j=0; j<note.length; j++) {
            Integer element = dictionary.get(note[j]);
            if(element != null && element > 0) {
                dictionary.put(note[j], element - 1);
            } else {
                printable = false;
            }
        }
        if(printable) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
