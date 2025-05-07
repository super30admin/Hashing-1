// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Problem statement: https://leetcode.com/problems/group-anagrams/

class Problem1 {

        public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String, LinkedList<String>> map = new HashMap<>();

            for(String s:strs){

                LinkedList<String> temp = null;

                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String s1 = new String(charArray);

                if(map.containsKey(s1)){
                    temp = map.get(s1);
                }else{
                    temp = new LinkedList<>();
                }

                temp.add(s);
                map.put(s1, temp);
            }

            return new ArrayList(map.values());

        }
    }
}
