/* Using prime number multiplication as the Hashing technique for string to store into hashmap<str, str[]> */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> map = new HashMap<Double, List<String>> ();

        for (int i = 0; i< strs.length; i++) {
            
            Double key = primeValue(strs[i]);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);

        }
        return new ArrayList<>(map.values());        
    }


    public Double primeValue(String s){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Double ret = 1.0;
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            ret *= prime[ch-'a'];
        }

        return ret;
    }
}