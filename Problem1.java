//Time Complexity: O(NK), where N is the length of strs, and K is the maximum length of a string in strs. 
//Counting each string is linear in the size of the string, and we count every string.
//Space Complexity: O(NK), the total information content stored in ans
// Two strings are anagrams if and only if their character counts (respective number of occurrences of each character) are the same.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
     public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
     }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups=new HashMap<>();

        for (String s: strs){
            int count[]=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append(count[i]);
            sb.append('#');
        }
        String key=sb.toString();
        groups.putIfAbsent(key,new ArrayList<>());
        groups.get(key).add(s);
        }
        return new ArrayList<>(groups.values());
    }}

    