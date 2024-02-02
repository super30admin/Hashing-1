// Time Complexity : O(n)  // n number of strings
// Space Complexity : O(n)  // number of strings
// Did this code successfully run on Leetcode  : Yes
// Any problem you faced while coding this : No 
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String [] strs = s.split(" ");
        char [] charArray = pattern.toCharArray();
        if(charArray.length != strs.length)
            return false;
        HashMap<Character,String> map = new HashMap<Character,String>();
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<charArray.length;i++)
        {
            if(!map.containsKey(charArray[i]))
            {
                if(!set.contains(strs[i]))
                {
                    map.put(charArray[i],strs[i]);
                    set.add(strs[i]);
                }    
                else
                    return false;
            }else{
                String temp = map.get(charArray[i]);
                if(!temp.equals(strs[i]))
                {
                    return false;
                }
            }
        }
        
        return true;
        
    }
}