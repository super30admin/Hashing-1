// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Calculating space complexity

// Approach : I had stored the words in an array and running a loop on it. 
// the value should be equal to word at the same index of the string . If it is not present in the map we will check if the
// if the word is present in the set . if so return false;
// if the set doesn't contain word add the c,word to map and word to set
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern ==null && s ==null) return true;
        if(pattern==null ||s ==null) return false;
        String words[] = s.split("\\s+");
        if(pattern.length() != words.length) return false;
        HashMap<Character ,String> sMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();


        for(int i=0;i<words.length ;i++)
        {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if(!sMap.containsKey(c)){
                if(set.contains(word)) return false;
                else{
                    sMap.put(c,word);
                    set.add(word);
                }
            } else {
                if(!sMap.get(c).equals(word)) return false;
            }
        }
    return true;
    }
}