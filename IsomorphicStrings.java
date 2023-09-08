// Time Complexity : O(logn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/isomorphic-strings/submissions/1043608225/
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
 * Using a hashmap to maintain the key value pair of s and t strings
 * Traverse through the s string, and check value of s matches with the value in t string
 * if matches, check if the value already exists in the map, if no, insert into the map 
 */
import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
    if(s.length()!=t.length()){
        return false;//Base condition
    }
    char c=' ';
    Map<Character,Character> map = new HashMap<>();
    for(int i=0;i< s.length();i++){
        if(map.containsKey(s.charAt(i))){
            c=map.get(s.charAt(i));
            if(c!= t.charAt(i))
                return false;
        }
        else if(!map.containsValue(t.charAt(i)))
            map.put(s.charAt(i),t.charAt(i));
        else 
            return false;
        
    }
    return true;
    }
}

//Using 2 hashmaps
class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }
            else{
                if(sMap.get(sChar)!=tChar)
                    return false;
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, sChar);
            }
            else{
                if(tMap.get(tChar)!=sChar){
                    return false;
                }
            }
        }
        return true;
    }
}
//Using HashMap & a HashSet
class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        // HashMap<Character, Character> tMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
                if(set.contains(tChar)){
                    return false;
                }
                set.add(tChar);
            }
            else{
                if(sMap.get(sChar)!=tChar)
                    return false;
            }
            
        }
        return true;
    }
}