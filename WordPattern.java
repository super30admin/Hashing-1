// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Created two hash maps and stored the values and keys accordingly as characters and strings.
   Split the string s according to spaces. If the key isn't stored, add it to the map.  
   If it exists, add the new value to the map as either character or string. 
 */
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        String str[] = s.split(" ");
        int count =0; 
        if(pattern == null && s==null) 
        return true; 
        if(pattern == null || s== null)
        return false; 
        if(str.length != pattern.length())
        return false;
        for(int i =0; i < pattern.length(); i++){
            char pChar = pattern.charAt(i);
            if(!pMap.containsKey(pChar))
            pMap.put(pChar,str[count]);
            else if(!pMap.get(pChar).equals(str[count]))
            return false; 
            if(!sMap.containsKey(str[count]))
            sMap.put(str[count],pChar);
            else if(!sMap.get(str[count]).equals(pChar))
            return false;
            count++;
        }
        return true;
    }
}