    
	//// Time Complexity : O(NKlog(K))
//// Space Complexity : O(NK)
//// Did this code successfully run on Leetcode : yes
//// Any problem you faced while coding this :
//  did not know how to copy char Array into string.
//   
//// Your code here along with comments explaining your approach
	class Solution {


        public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String,List<String>> map = new HashMap<>();


            for(int i = 0 ;i<strs.length;i++){

                char[] tempArray = strs[i].toCharArray();
                Arrays.sort(tempArray);
				//sorting a st
                String key = String.valueOf(tempArray);

                if(!map.containsKey(key))
                  map.put(key,new ArrayList());
			  
                map.get(key).add(strs[i]);

            }


            return new ArrayList(map.values());
        }
    }


    // Time Complexity : O(NKlog(K))
    //Space Complexity :O(NK)