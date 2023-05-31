//Time Complexity - O(NKlogK) -- not sure
//Space Complexity - O(NK) -- not sure
/* Approach - used Hashmap to store sorted string
 as key and all possible anagrams as list of values. 
 Then copy all the values to list to give required list of list as output
*/
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> temp;
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str:strs){

            char[] sChar = str.toCharArray();
            Arrays.sort(sChar);
            String sortedStr = String.valueOf(sChar);
            if(!map.containsKey(sortedStr)){ 
                temp = new ArrayList<>();
                temp.add(str);
                map.put(sortedStr,temp);
            } else{
                map.get(sortedStr).add(str);
            }
            
        }
        return new ArrayList(map.values());
    }
}