/*
 * Time complexity: O(N)
 * Space Complexity: O(N) 
 * Successfully ran this code on leetcode
 */

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> store = new HashMap<>();
        HashSet<Character> values = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            if(store.containsKey(s.charAt(i))){
                if(store.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else {
                 if(values.contains(t.charAt(i))){
                    return false;
                 }
                 store.put(s.charAt(i), t.charAt(i));
                 values.add(t.charAt(i));
            }
            
        }
        return true;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.isIsomorphic("egg", "add"));
    }
}