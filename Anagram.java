// Time Complexity : O(nklog(k)) + O(n), where n=length of the list of strings and k=average size of each string
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return new ArrayList<>();           //if empty list then create empty array list
        HashMap<String, List<String>> map = new HashMap<>(); //Sorted String and list of anagrams associated with it
        
        //Traverse through the list and sort each string by converting it to character array
        for(int i=0; i<strs.length; i++){
            char [] charArr = strs[i].toCharArray();    //coverting into character array
            Arrays.sort(charArr);                       //sorting the string
            String sorted = String.valueOf(charArr);    //converting back into string 
            
            if(!map.containsKey(sorted)){              //check whether hashmap contains sorted string key
                map.put(sorted, new ArrayList<>());    //if it doesn't contain the sorted string key, then create one
            }
            map.get(sorted).add(strs[i]);              //if it contains sorted string key, then add the string to this list 
        }
        
        return new ArrayList<>(map.values());
    }
}