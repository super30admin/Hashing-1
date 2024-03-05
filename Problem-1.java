import static java.lang.Character.valueOf;
import java.util.*;
/* Time Complexity : O(n * klogk) where n is no. of strings in strs and k is no.of char of in strs[i];
 * Space Complexity : O(n *k) where n is no. of strings in strs and k is no.of char of in strs[i];
 * 
 * I choose an approch of sorting the char and mapping it to the same value contain elemnts in to Arraylist.
 * I can also try prime factor approch which make me reduce time complexity to O(nk), however, in interview perspective might not get primenumbers values.
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length ==0){
            return result;
        }
        HashMap <String, List<String> > map  = new HashMap<>();
        for (int i =0; i< strs.length; i++){ //O(n)
            String s = strs[i];
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr); //O(klogk)
            String sorted = String.valueOf(charArr);
            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());

        
    }
}