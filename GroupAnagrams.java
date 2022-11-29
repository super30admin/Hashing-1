//https://leetcode.com/problems/group-anagrams

//Time Complexity :O(NK) where N is the size of given array and K is the average length of String
//Space Complexity :O(NK) 
//Solution by sorting the individual strings and storing as keys in the hashmap
class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s=String.valueOf(charArray);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>());
                
            }
                map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

//Time Complexity :O(NK) where N is the size of given array and K is the average length of String
//Space Complexity :O(N)
//Solution by taking the prime product of the individual strings and storing as keys in the hashmap
class Solution2 {
    public int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();
        for(String str : strs){
            double d = primeProduct(str);
            if(!map.containsKey(d)){
                map.put(d,new ArrayList<String>());
                
            }
                map.get(d).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private double primeProduct(String s){
        double result = 1;
        for(char c : s.toCharArray()){
            result = primes[c - 'a'] * result;
        }
        return result;
    }
}
