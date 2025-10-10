import java.util.HashMap;

public class Anagram {

    // Approach-1 (using custom-map)
    static boolean isAnagramUsingCustomMap(String s, String t) {

        int sl = s.length(); // `r, a, t`
        int tl = t.length(); // `c, a, t`

        if (sl != tl)
            return false;

        int[] customMap = new int[26];
        for (int idx = 0; idx < s.length(); ++idx) {
            customMap[s.charAt(idx) - 'a']++;
        }

        for (int idx = 0; idx < t.length(); ++idx) {
            customMap[t.charAt(idx) - 'a']--;
            if (customMap[t.charAt(idx) - 'a'] < 0)
                return false;
        }

        return true;
    }

    // Approach-2 (using Hashmap)
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        //If map is empty, strings are anagrams
        return map.isEmpty();
    }

    public static void main(String[] args) {

    }
}