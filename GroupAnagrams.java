import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    /*
    Time Complexity : N(KlogK)
    Space Complexity : O(1)
    Did this problem run on leetcode : yes
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++) { //O(N)
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr); //Klog(K) where K is no of chars in String
            String str = String.valueOf(charArr);
            if(!map.containsKey(str)) { //O(K)
                map.put(str, new ArrayList<>());

            }
            map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
