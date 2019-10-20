// 205. Isomorphic Strings
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No getting this test case failed, Input: ab aa Output: true

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sHash = new HashMap<>();
        HashMap<Character, Character> tHash = new HashMap<>();

        if(s.length() != t.length())
            return false;

        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = s.charAt(i);

            if(!sHash.containsKey(a))
                sHash.put(a, b);
            else{
                if(!sHash.get(a).equals(b))
                    return false;
            }

            if(!tHash.containsKey(b))
                tHash.put(b, a);
            else{
                if(!tHash.get(b).equals(a))
                    return false;
            }
        }
        return true;
    }
}