// Time Complexity :O(N*K) where n is number of words and k is the maximum length of a word
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Stored all the character counts of a word as the key in the hashmap.
// if a word count matches with the key, will add the word to that key.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> words=new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++){
            int[] check=new int[26];
            for(int j=0;j< strs[i].length();j++){
                char e= strs[i].charAt(j);
                check[e-'a']++;
            }
            
            if(words.containsKey(Arrays.toString(check))){
                words.get(Arrays.toString(check)).add(strs[i]);
                
            }
            else{
                List<String> c= new ArrayList<String>();
                c.add(strs[i]);
                words.put(Arrays.toString(check),c);
                
                
            }
        }
        List<List<String>> ch =new ArrayList<List<String>>();
        for(List x : words.values()){
            ch.add(x);
        }
        return ch;
    }
}