// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// split the string s into words.
// used one map and one set. map is for checking if character is mapped and to which string it is mapped.
//  set is for checking whether if word is mappped.



class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        System.out.println(words.length);
        if(pattern.length() != words.length) return false;
        HashMap<Character,String>map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            String str = words[i];
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(str)) return false;
            }
            else if(set.contains(str))
            {
                return false;
            }
            else
            {
                map.put(c,str);
                set.add(str);
            }
        }
        return true;
        
    }
}