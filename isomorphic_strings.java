// TC:O(n)+O(n)=O(n)
// SC:O(1) -> as we r returning nothing
//solved in leetcode:YES

"""
Here we take one to one mapping with each value from s set and t set and also vice-versa
"""

class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character>forward = new HashMap<>();
       HashMap<Character,Character>backward = new HashMap<>();
        """It iterates O(n)times
        """
       for(int i=0;i<s.length();i++)
       {
           char t_char = t.charAt(i);
           char s_char = s.charAt(i);
           if(forward.containsKey(s_char))
           {
               if(forward.get(s_char)!=t_char)
               {
                   return false;
               }
           }
           else
           {
               forward.put(s_char,t_char);
           }
       }
       """It iterates O(n)times
        """
       for(int i=0;i<t.length();i++)
       {
           char t_char = t.charAt(i);
           char s_char = s.charAt(i);
            if(backward.containsKey(t_char))
            {
               if(backward.get(t_char)!=s_char)
               {
                   return false;
               }
           }
           else
           {
               backward.put(t_char,s_char);
           }
       }
       return true;
    }
}