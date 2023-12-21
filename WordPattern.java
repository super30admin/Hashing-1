// Time Complexity : O(n) where n is the length of split array as well as string s
// Space Complexity : O(n) for Hashmap and HashSet
// Method : Hashing

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        if(pattern == null && s == null) return true;
        
        String[] splitArray = s.split(" ");
        if(pattern.length() != splitArray.length) return false;
        
        HashMap<Character, String> h = new HashMap();
        HashSet<String> hs= new HashSet();
        
        for(int i = 0;i < pattern.length();i++)
        {
            char c = pattern.charAt(i);
            String s1 = splitArray[i];
            
            if(h.containsKey(c))
            {
                if(!h.get(c).equals(s1)) return false;
                else continue;
            }
            else
            {
                if(hs.contains(s1)) return false;
            }
            h.put(c, s1);
            hs.add(s1);
        }
        return true;
    }
}