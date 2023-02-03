/*
 * Time Complexity : O(n)
 * Space Complexity :  O(n)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - Here we take 2 hashmaps and one for s string and other for t string. For every character we encounter in the s string we find it's corresponding character in the t string and vice versa.
 * If the charater already exists in the map then we check if its value is equal to the t string character. If not then the strings are not isomorphic. If the character doesn't exist in the map, then we 
 * push the character. We do the same for both s and t strings. At the end if the conditions satisfy for both we return true as in the strings are isomorphic. 
 */

//https://leetcode.com/problems/isomorphic-strings/description/

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i))!=t.charAt(i))return false;
            }else{
                sMap.put(s.charAt(i),t.charAt(i));
            }
            if(tMap.containsKey(t.charAt(i))){
                if(tMap.get(t.charAt(i))!=s.charAt(i))return false;
            }else{
                tMap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}