// package DailyCodeProblems.3_GroupAnagrams;

import java.util.*;

public class GroupAnagram {

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
        String[] stringArr = {"eat","tea","tan","ate","nat","bat"};
        for
        
    }
}
