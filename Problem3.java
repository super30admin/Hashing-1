// Time Complexity - O(n) where n is the number of characters in pattern
// Space Complexity - O(n) where n is the number of characters in pattern
// This Solution worked on LeetCode

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length() ==0 || str.length() == 0 || pattern == null || str == null)
            return false;
        String[] str_split = str.split("\\s+");
        if(pattern.length() != str_split.length)    return false;
        HashMap<Character,String> pmap = new HashMap<>();  
        HashMap<String,Character> smap = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String s = str_split[i];
            if(!pmap.containsKey(p))
                pmap.put(p,s);
            else if(!pmap.get(p).equals(s))
                    return false;
            if(!smap.containsKey(s)) 
            	smap.put(s,p);
            else if(!smap.get(s).equals(p))
            	return false;
        }
        return true;
    }
}
