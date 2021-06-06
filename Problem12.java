// Time Complexity : NLO(log(N))
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 
not 100% sure about space complexity, should be O(N) because we are creating an arraylist

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {//check for empty lists
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>(); 
        for(String str: strs){
            char [] charArr = str.toCharArray();//store all characters from a string into the array
            Arrays.sort(charArr);//sort them out to be used later in the key
            String sorted = String.valueOf(charArr);//create string from the characters
            if(!map.containsKey(sorted)){//put the string in the map if not there with the respective key so it keeps growing
                map.put(sorted, new ArrayList<>());                
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());//return all map values correctly bunched up that have the same key
    }
}
