class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Integer, List<String>> map = new HashMap<>();
        for(String s : strs){
            int key = calculateKey(s);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    public int calculateKey(String s){
        int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int multi = 1;
        
        for(char c: s.toCharArray()){
            multi *= primes[c - 'a'];
        }
        return multi;
    }
}
