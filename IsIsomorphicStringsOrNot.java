import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : 0(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
public class IsIsomorphicStringsOrNot {

    public boolean IsIsomorphicStringsOrNot(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int s1 = s.length();
        for(int i = 0; i<s1;i++){
            if(map.get(s.charAt(i))==null) {
                char t1 = t.charAt(i);
                if(set.contains(t1))  return false;
                else{
                    map.put(s.charAt(i), t.charAt(i));
                    set.add(t.charAt(i));
                }
            }
            if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            if(map.get(s.charAt(i))==null && set.contains(t.charAt(i))) return false;
        }
        return true;
    }
}
