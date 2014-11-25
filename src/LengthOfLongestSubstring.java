import java.util.HashMap;
import java.util.Map;


public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s)
    {
        // Last position of character in the string.
        final Map<Character, Integer> pos = new HashMap<Character, Integer>();
        // Start point of current sub string.
        int start = 0;
        // Length of current longest sub string.
        int max = 0;

        for (int i = 0; i < s.length(); ++i)
        {
            final char character = s.charAt(i);
            start = Math.max(start, (pos.containsKey(character) ? (pos.get(character) + 1) : 0));
            max = Math.max(max, i - start + 1);
            pos.put(character, i);
        }

        return max;
    }
}
