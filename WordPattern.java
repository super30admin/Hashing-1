// Time Complexity :O(N) where n is the length of the string
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Stored all the characters of pattern  as key and the mapped word of string s as value in hashmap.
//Also stored all the words of string s in hashset to check for already presnt values.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length()!= word.length)
            return false;
       // System.out.println("srdg");
        HashMap<Character,String> pmap = new HashMap<>();
        HashSet<String> smap = new HashSet<>();
        for(int i=0;i< pattern.length();i++){
            if(pmap.containsKey(pattern.charAt(i))){
                
       // System.out.println(i+"1");
                if(!pmap.get(pattern.charAt(i)).equals(word[i]))
                    return false;
            }
            else{
       // System.out.println(i+"2");
                if(smap.contains(word[i]))
                    return false;
                else{
                    smap.add(word[i]);
                    pmap.put(pattern.charAt(i),word[i]);
                }
            }
            
        }
             return true;
    }
}