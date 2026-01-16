package leetcode.easy.p242_valid_anagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] wordS = s.toCharArray();
        char[] wordT = t.toCharArray();

        int[] counts = new int[26];


        // rat
        // art
        if (s.length() != t.length()) {
            return false;
        }
            for (char ws : wordS) {
                counts[ws - 'a']++;
            }
            for (char wt : wordT) {
                counts[wt - 'a']--;
                if (counts[wt - 'a'] < 0) {
                    return false;
                }
            }

        return true;
    }
}
