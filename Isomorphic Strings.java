// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s== null || t== null)
        return false;

        if(s.length()!=t.length())
        return false;
        Map<Character, Character> map= new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))!=t.charAt(i))
                return false;

            }

            else
            {
                map.put(s.charAt(i),t.charAt(i));

                if(set.contains(t.charAt(i)))
                return false;

                set.add(t.charAt(i));
            }

        }
        return true;
    }
}
