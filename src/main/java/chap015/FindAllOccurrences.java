package chap015;

import java.util.ArrayList;
import java.util.List;

public class FindAllOccurrences {

    public static List<Integer> findAllOccurrences(String string, String substring) {
        if(string == null || substring == null) {
            throw new IllegalArgumentException("Provided parameters shouldn't be null");
        }

        if(string.isEmpty() || substring.isEmpty()) {
            throw new IllegalArgumentException("Provided parameters shouldn't be empty");
        }

        List<Integer> list = new ArrayList<Integer>();

        // our variable to track the position of the characters
        int lastMatchingIndex = 0;

        // na vrh brda vrba mrda
        do {
            lastMatchingIndex = string.indexOf(substring, lastMatchingIndex);
            if (lastMatchingIndex != -1) {
                list.add(lastMatchingIndex);
                lastMatchingIndex++;
            }
        } while (lastMatchingIndex != -1);

        return list;
    }
}
