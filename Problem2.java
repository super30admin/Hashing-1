Approach:
/*  1. As we are checking s to t strings mapping and t to s mapping 
        and this should be happening in O(1). hashmap(keys: characters of S, values: characters of T).

    2. Checking hashmap values costs O(n). 
        To keep track of hashmap values in O(1). Here, we are using hashset that only  contains values.
        //we can use 2 hashmap also.
        
* 
*   3. For every character of S, map it with t character at same sIndex.
        But, we have to check whether tchar is mapped to other character in S.
        Therefore, we have to check values of hashmap.

* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n) -
* 
* Space Complexity: O(1)  //only the characters are 256 o(256) which is only a constant.
we cannot use one hasmap for both strings because we cannot distinguish which mapping is from which string.
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {   
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!sMap.containsKey(schar))
            {
                if(tSet.contains(tchar))   //value is already used
                {
                    return false;
                }else{
                    sMap.put(schar,tchar);
                    tSet.add(tchar);
                }

            }else
            {  
                if(sMap.get(schar) != tchar) return false;  
            }
        } 
        return true;
    }
}