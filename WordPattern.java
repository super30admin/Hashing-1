// Time Complexity : O(n), n = length of string
// Space Complexity : O(1) because at max there can be only 26 characters in the map
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : String to String comparison should be done via equals


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] charArr = pattern.toCharArray();
        String[] arr = str.split(" ");

        if(charArr.length != arr.length){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0 ; i < charArr.length ; i++){
            char c = charArr[i];
            String s = arr[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(s)){ // same character in pattern can not be mapped to different string
                    return false;
                }
            }
            else{
                //return false if s has already been mapped to some other char
                if(set.contains(s)){
                    return false;
                }
                map.put(c,s);
                set.add(s);
            }
        }

        return true;
    }
}