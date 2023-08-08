// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class isItIsomorphic {
    public boolean isIsomorphic(String s, String t) {

        if(s==null|| t==null) return false;

        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(sMap.containsKey(s.charAt(i)))
            {
                if(sMap.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else{
                sMap.put(s.charAt(i),t.charAt(i));
            }
            if(tMap.containsKey(t.charAt(i)))
            {
                if(tMap.get(t.charAt(i)) != s.charAt(i)) return false;
            }
            else{
                tMap.put(t.charAt(i),s.charAt(i));
            }
            
        }
    return true;
        
    }
}