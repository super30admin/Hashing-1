// Time Complexity : O(k) where k is the length of the input words
// Space Complexity : O(k) where k is the length of the input words
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach in three sentences only
//check if the current letter has been assigned another character if yes check if the current assigned character is also same
//also check if the chracater being assigned has been assigned to any other letter earlier then return false

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> sM = new HashMap<>();
        HashMap<Character, Character> tM = new HashMap<>();

        char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();

        for(int i = 0;i<sTemp.length;i++){
            if(sM.containsKey(sTemp[i])){
                if(sM.get(sTemp[i]) != tTemp[i]) return false;
            }else if(tM.containsKey(tTemp[i])){
                 if(tM.get(tTemp[i]) != sTemp[i]) return false;
            }else{
                sM.put(sTemp[i],tTemp[i]);
                tM.put(tTemp[i],sTemp[i]);
            }
        }

        return true;

    }
}