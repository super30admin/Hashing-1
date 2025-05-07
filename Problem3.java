/* Problem 3: Word Pattern
*/

// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach: we will follow the same process as we did in isomorphic string
//here we will create hashmap and have 1 to 1 mapping of characters with words with space included
//we will create two hashmap to have both 1 to 1 mapping

class Solution {
    public boolean wordPattern(String pattern, String s) {
        //include spaces in string s
        String[] arr = s.split(" ");
        int n = arr.length;
        int k = pattern.length();
        //check first condition: if the length of both pattern and string s don't match only, then return false
        if(n != k) return false;
        //initialising two hashmaps
        HashMap<Character, String> sMap = new HashMap<Character, String>();
        HashMap<String, Character> pMap = new HashMap<String, Character>();
        for(int i = 0; i < n; i++){
            char p = pattern.charAt(i);
            //if map doesn't contain character as key, then please add it
            if(!sMap.containsKey(p)){
                sMap.put(p, arr[i]);
            }
            else {
                if(!sMap.get(p).equals(arr[i])) return false;
            }
            if(!pMap.containsKey(arr[i])){
                pMap.put(arr[i], p);
            }
            else {
                if(!pMap.get(arr[i]).equals(p)) return false;
            }
        }
        return true;
    }
}