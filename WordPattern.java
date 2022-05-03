// Time Complexity : O(n) 
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        List<String> assignedStr = new ArrayList<>();
        String[] strs = s.split(" ");
        if(strs.length != pattern.length())
            return false;
        for(int i = 0; i< pattern.length(); i ++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                //If String already exists in hashmap, then we compare its key with Corresponding string in String[]
                //If it is not equal then return false
                if(!map.get(ch).equals(strs[i]))
                    return false;
            }
            else{
                //If the String is not in hashmap but the String has already assigned to other String then return false
                if(assignedStr.contains(strs[i]))
                    return false;
                assignedStr.add(strs[i]);
                map.put(ch, strs[i]);
            }
        }
        return true;
    }
}