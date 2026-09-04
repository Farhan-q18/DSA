import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // s1 cannot fit inside s2
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        // Create the first window in s2
        for (int i = 0; i < s1.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        // Slide the window through s2
        for (int i = s1.length(); i < s2.length(); i++) {

            // Add the new character
            freq2[s2.charAt(i) - 'a']++;

            // Remove the character leaving the window
            freq2[s2.charAt(i - s1.length()) - 'a']--;

            // Check the current window
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}