//Leetcode 49 : Group Anagrams
//Solved on Leetcode : YES
//Issues faced : NO
//Time complexity : 
//Space complexity : 


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h1 = new HashMap<>();
        for(String S : strs){
            char[] chararray = S.toCharArray();
            Arrays.sort(chararray);
            String sortedstring = new String(chararray);
            if(h1.containsKey(sortedstring)){
                h1.get(sortedstring).add(S);
            } 
            else{
                h1.put(sortedstring, new ArrayList<>());
                h1.get(sortedstring).add(S);
            }
        }
        return new ArrayList(h1.values());
    }
}