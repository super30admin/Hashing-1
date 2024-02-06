//SC: O(1)
//TC : O(n) (length of s or t)
class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s==null&&t==null)
        return true;
        if(s==null||t==null)
        return false;
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Character> Map_1=new HashMap<>();
         HashMap<Character,Character> Map_2=new HashMap<>();
         int i;
         char s_c;
         char t_c;
         for(i=0;i<s.length();i++)
         {
           s_c=s.charAt(i);
           t_c=t.charAt(i);
           if(Map_1.containsKey(s_c))
           {
               if(Map_1.get(s_c)!=t_c)
               return false;
           }
           else{
               Map_1.put(s_c,t_c);
           }
            if(Map_2.containsKey(t_c))
           {
               if(Map_2.get(t_c)!=s_c)
               return false;
           }
           else{
               Map_2.put(t_c,s_c);
           }


         }
        
    return true;
    }
}