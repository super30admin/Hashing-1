// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Time Complexity :n(klogk) klogk for sorting n words , by using prime product method it will come to nk
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO

// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // if(strs.length== 1) return strs[0];
        // List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);//klogk
            // sorted is our key
            String sorted = String.valueOf(cArr);//string valueOf() method converts different types of values into string
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            //Trickkk
            map.get(sorted).add(str); // its not else , its like taking that sorted key and adding str to it // it runs all the time

        }
        return new ArrayList<>(map.values());
    }
}

//Prime Products approach
