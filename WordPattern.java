// Time Complexity : O(n) we traverse through s and t linearly
// Space Complexity : O(1) we will only map upto 26 characters (total number of alphabets)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, used the lessons learned in class

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\s");

        //base case
        if(pattern.length() != words.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!map.containsKey(c)){
                map.put(c, word);
                if(set.contains(word)){
                    return false;
                }
                set.add(word);
            }else{
                if(!map.get(c).equals(word)){
                    return false;
                }
            }
        }

        return true;
    }
}
