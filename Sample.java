//****ISOMORPHIC STRINGS= USING HASHMAP****
//Time complexity: length of the string: o(n);
//Space complexity:As we are using 2 hashmap to maintain the mappings o(n)+o(n)= o(2n) =>*o(n)*
//Leetcode runnable: Y;
//Any questions : No;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap= new HashMap<>();
        HashMap<Character, Character> tmap= new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char st=s.charAt(i);
            char tt=t.charAt(i);
            
            if(smap.containsKey(st))
            {
                char copy=smap.get(st);
                if(copy!=tt)
                {
                    return false;
                }
            }
            else
            {
                smap.put(st, tt);
            }
            
            //tmapping
            if(tmap.containsKey(tt))
            {
                char copyx=tmap.get(tt);
                if(copyx!=st)
                {
                    return false;
                }
            }
            else
            {
                tmap.put(tt, st);
            }
            
        }
        return true;
    }
}

//****ISOMORPHIC STRINGS= USING CHARACTER ARRAY****
//Time complexity: length of the string: o(n);
//Space complexity:As we are using 2 ARRAYS to maintain the mappings o(n)+o(n)= o(2n) =>*o(n)*
//Leetcode runnable: Y;
//Any questions : No;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char [] smap= new char[256];
        char [] tmap= new char[256];
        
        for(int i=0;i<s.length();i++)
        {
            char st=s.charAt(i);
            char tt=t.charAt(i);
            
            if(smap[st - ' ']!=0)
            {
                if(smap[st - ' '] !=tt)
                {
                    return false;
                }
                
            }
            else
            {
                smap[st - ' ']= tt;
            }
            
            //tmapping
            if(tmap[tt - ' ']!=0)
            {
                if(tmap[tt - ' ']!=st)
                {
                    return false;
                }
                
            }
            else
            {
                tmap[tt - ' ']= st;
            }
            
        }
        return true;
    }
}

