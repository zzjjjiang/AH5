import java.util.Collections;
import java.util.HashMap;

class Solution {
    public static char mostFrequentChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character ans = 'a';
        for(int i =0;i<s.length();i++) {
            if (map.containsKey(Character.toLowerCase(s.charAt(i)))) {
                map.put(Character.toLowerCase(s.charAt(i)), map.get(s.charAt(i)) + 1);
            } else {
                map.put(Character.toLowerCase(s.charAt(i)), 1);
            }
            int max = -1;
            for (char a : map.keySet()) {
                if (map.get(a) > max) {
                    max = map.get(a);
                    ans = a;
                }
            }
        }
        return ans;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
    }

  }
