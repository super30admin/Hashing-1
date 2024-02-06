//SC: O(n)
//TC: O(n)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] new_str=s.split(" ");
        if(new_str.length!=pattern.length())
        return false;
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();

        for(int i=0;i<pattern.length();i++)
        {
            if(map1.containsKey(pattern.charAt(i)))
            {
                if(!map1.get(pattern.charAt(i)).equals(new_str[i]))
                {
                    return false;

                }
            }
            else
            {
            map1.put(pattern.charAt(i),new_str[i]);
            }
            if(map2.containsKey(new_str[i]))
            {
                if(!(map2.get(new_str[i])==pattern.charAt(i)))
                {
                    return false;

                }
            }
            else
            {
            map2.put(new_str[i],pattern.charAt(i));
            }
        
        
        }
     return true;   
    }
}