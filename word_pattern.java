// TC:0(n)
// SC:0(1)
//solved in leetcode:YES

class Solution {
    public boolean wordPattern(String pattern, String s) {
        s = s.trim();
        String[] words = s.split(" ");

        HashMap<Character,String> forward = new HashMap<>();
        HashMap<String,Character> backward = new HashMap<>();
        //basic check that 2 comparisons should be same length
        if(pattern.length()!=words.length)
        {
            return false;
        }
        """It iterates O(n)times
        """
        for(int i=0; i<pattern.length();i++)
        {
            char s_char = pattern.charAt(i);
            String t_char = words[i];


            if(forward.containsKey(s_char))
            {
                if(!forward.get(s_char).equals(t_char))
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
        for(int i=0; i<words.length;i++)
        {
            String s_char = words[i];
            char t_char = pattern.charAt(i);

            if(backward.containsKey(s_char))
            {
                if(!backward.get(s_char).equals(t_char))
                {
                    return false;
                }
            }
            else
           {
               backward.put(s_char,t_char);
           }
        }
        return true;
    }
}