/* Word Pattern */

// Time Complexity : O(N) (where N is the length of any string)
// Space Complexity : O(1) because we are maintaining ASCII characters(lowercase or uppercase-it can be maximum 52 which is constant)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//Here we will again be maintaining two hashmaps(Characters, Words)
//But, here we are doing 1 to 1 relation between characters and words
//example: char: abba and word: Cat Fish Fish Cat
//Edge case:we have to first consider if the length of values is equal to length of word after separting spaces

class Solution {
    public boolean wordPattern(String pattern, String str) {
        //create a string array and store words after splitting
        String[] arr = str.split(" ");
        int n = arr.length;
        int k = pattern.length();
        //edge case
        //Check if the length of pattern and string array are not equal, then return false
        if(n != k) return false;
        //initialise two hashmaps for pattern and string
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        //iterate over a pattern
        for(int i = 0; i < n; i++){
            char a = pattern.charAt(i);
            //check if hashmap for pattern consist char as key
            //if it doesn't, put inside the hashmap keys and values(words)
            if(!pMap.containsKey(a)){
                pMap.put(a, arr[i]);
            }
            //if it already exist, check the mapping for pattern to string
            else {
                if(!pMap.get(a).equals(arr[i])) return false;
            }
            //doing the same 1 to 1 relation from other way(string to pattern)
            if(!sMap.containsKey(arr[i])){
                sMap.put(arr[i], a);
            }
            else {
                if(!sMap.get(arr[i]).equals(a)) return false;
            }
        }
        return true;
    }
}