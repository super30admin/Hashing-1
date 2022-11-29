//Time Complexity :O(N) where N is the size of given String 
//Space Complexity :O(N) constant space because of  map size can only be of size of character set 
//https://leetcode.com/problems/word-pattern
  class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] strArr = s.split(" ");
        if(pattern.length() != strArr.length) return false;
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c)){
                if(set.contains(strArr[i])) return false;
                map.put(c,strArr[i]);
                set.add(strArr[i]);
            }else{
                if(!map.get(c).equals(strArr[i])) return false;
            }
        }
        return true;
    }
}
