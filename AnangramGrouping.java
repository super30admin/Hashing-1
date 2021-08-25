//Given an array of strings, group anagrams together.
//Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
//Note: All inputs will be in lowercase. 
//The order of your output does not matter.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collection;

// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution{
	
	HashMap<String,List<String>> groupedAnagrams = new HashMap<String,List<String>>();
    /** Initialize your data structure here. */
    public Solution() {

    }
    public String sortString(String send) {
    	
    	char tempArray[] = send.toCharArray();
        Arrays.sort(tempArray);
        return new String (tempArray);
    }
    public List<List<String>> groupAnagrams(String[] array) {
    	
    	for (int i=0;i<array.length;i++) 
    	{
    		
            String receieved = sortString(array[i]);
            if(groupedAnagrams.containsKey(receieved)) {
            	System.out.println("Adding value for a seen key of:"+sortString(array[i]));
            	groupedAnagrams.get(receieved).add(array[i]);
            }
            else {
            	
            	ArrayList<String>tempArrayList = new ArrayList<String>();
            	tempArrayList.add(array[i]);
            	System.out.println("tempArrayList.get(0):"+tempArrayList.get(0));
            	groupedAnagrams.put(receieved, tempArrayList);
            }
    	}
    	
    	List<List<String>>returnList = new ArrayList<List<String>>();
    	for (Map.Entry<String,List<String>> entry : groupedAnagrams.entrySet()) {
           
            returnList.add(entry.getValue());
    	}
    	
    	return returnList;
    }    
}