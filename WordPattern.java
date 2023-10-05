
// Time Complexity : O(log(n))
// Space Complexity : O(1) Space is constant because at max we can have 26 alphabets
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
 System.out.println(str[i]);

        }
        if(pattern.length()!=str.length)return false;
        if(pattern==null & str==null)return true;
        if(pattern==null || str==null)return false;
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),str[i]);
            }
            else{
                if(!map.get(pattern.charAt(i)).equalsIgnoreCase(str[i])){
return false;
                }
                map.put(pattern.charAt(i),str[i]);
            }

            if(!map2.containsKey(str[i])){
                map2.put(str[i],pattern.charAt(i));
            }
            else{
                if(map2.get(str[i])!=pattern.charAt(i)){
return false;
                }
                map2.put(str[i],pattern.charAt(i));

                }
                map.put(pattern.charAt(i),str[i]);
            }
                 return true;
        }
}