// Time Complexity : O(1) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this: Understood the logic but made syntax errors
// Your code here along with comments explaining your approach: we need to either create two hashmaps or one hasmap and one hashset
        //in one hashmap, we will consider characters of string 's' as keys and values will be the charaters of string 't'. we will check if the character already exists in the hashmap. if it does, then we will check if the value is the same as the new value that we are adding, if not then we return false. othetrwise we return true. If the character is not present in the hashmap, we add the key character and then the value from t. Once we have check this from s to t, then we check it in a reverse form from t to s. Hence, to do this we require a new hashmap or a hashset.
// HashSet: If the value is not there in the hashmap, then we check the hashset. If it is present there, then  we return false otherwise add it to the hashmap. 


class Solution {
    public boolean isIsomorphic(String s, String t) {
     
if(s.length()!=t.length()) return false;
if(s==null && t==null) return true;
if(s==null || t==null) return false;

        HashMap<Character,Character> First=new HashMap<>();
        HashMap<Character,Character> Second=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
           char schar=s.charAt(i);
           char tchar=t.charAt(i);
            if(!First.containsKey(schar))
            {
                First.put(schar,tchar);
                System.out.println(First.values());
            }

//if the key is already there, check its value . check if the value we are trying to add from t is the same

            else  if (First.get(schar)!=tchar)
            {
                return false;
            }
            if(!Second.containsKey(tchar))
            {
                Second.put(tchar,schar);
            }

//if the key is already there, check its value . check if the value we are trying to add from t is the same

            else  if (Second.get(tchar)!=schar)
            {
                return false;

            }
      
        }
        
return true;

    }
}

/*
 
Using Hashset
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {


        if(s.length()!=t.length()) return false;
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;

        HashMap<Character,Character> First=new HashMap<>();
        HashSet<Character> Second=new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            //if the character is already present in the hashmap

            if(First.containsKey(schar))
            {
                if (First.get(schar)!=tchar) return false;
            }

            else
            {
            if (Second.contains(tchar))    return false;

            else
            {
                First.put(schar,tchar);
                Second.add(tchar);
            }
            }


        }

        return true;

    }
}
 */