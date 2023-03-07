// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Assign a prime number to each letter and then compute the value of the string and map it to a character.
   If the key isn't stored, add it to the map and create a list on it. 
   If it exists, add the new value to the list.
 */
class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        for(int i =0; i< strs.length;i++){
            String str = strs[i];
            double primeProduct = Prime(str);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList<>());
            }
                map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private double Prime(String s){
        double result =1d; 
        int index; 
        int[] prime ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(int i =0; i < s.length();i++){
            char c = s.charAt(i);
            index = prime[c-'a'];
            result = result * index;
        }
        return result;
    }
}