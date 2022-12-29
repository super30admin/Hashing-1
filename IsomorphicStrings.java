import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Approach 1: In this approach we use two hashmap to store S -> T mapping and T -> S mapping. Firstly we check for S, 
//If the key is not present in Smap we add a new key with values from T.
//If it is there we check its value. If is not equal to char in T we return false. We repeat the same for T string.

class Solution {

    HashMap<Character,Character> smap = new HashMap<Character,Character>();
    HashMap<Character,Character> tmap = new HashMap<Character,Character>();
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false;
        if(s == null && t== null) return true;
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            char Schar = s.charAt(i);
            char Tchar = t.charAt(i);
            if(smap.containsKey(Schar)){
                if(smap.get(Schar)!= Tchar){
                    return false;
                }
            }else{
                smap.put(Schar,Tchar);
            }

            if(tmap.containsKey(Tchar)){
                if(tmap.get(Tchar)!= Schar){
                    return false;
                }
            }else{
                tmap.put(Tchar,Schar);
            }
        
        }
        return true;

    }
}

// Approach 2: In this approach we use one hashmap and one hash set to store S -> T mapping and store values in the hashset. 
//Firstly we check for S, If the key is not present in Smap and there is no values in the hashset equal to T then put the key value to hashmap
//and add the value to the set. If the value is already present then it is mapped to some other key so we return false.
//If the key is there we check its value. If is not equal to char in T we return false.

class Solution2 {

    HashMap<Character,Character> smap = new HashMap<Character,Character>();
    HashSet<Character> tset = new HashSet<Character>();
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false;
        if(s == null && t== null) return true;
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            char Schar = s.charAt(i);
            char Tchar = t.charAt(i);
            if(smap.containsKey(Schar)){
                if(smap.get(Schar)!= Tchar){
                    return false;
                }
            }else{
                if(tset.contains(Tchar)){
                    return false;
                }else{
                    smap.put(Schar,Tchar);
                    tset.add(Tchar);
                }
            }
        }
        return true;

    }
}