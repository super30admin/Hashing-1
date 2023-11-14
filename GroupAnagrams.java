//  Time complexity: O(kn)
// Space Complexity: O(n)
class Solution {

    int primeArr[]; 

    public List<List<String>> groupAnagrams(String[] strs) {

        // Using prime number for mapping
        primeArr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        Map<Double, List<String>> map = new HashMap<>();
        for(String str: strs){
            double hash = getHash(str);
            if(!map.containsKey(hash))
                map.put(hash, new ArrayList<>());
            map.get(hash).add(str);
        }
        return new ArrayList<>(map.values());

        // Approach using hashmap and sorting string 
        // List<List<String>> ans = new ArrayList<>();
        // Map<String, List<String>> map = new HashMap<>();

        // for(String s: strs){
        //     char chr[] = s.toCharArray();
        //     Arrays.sort(chr);
        //     String sorted = new String(chr);

        //     if(!map.containsKey(sorted)){
        //         map.put(sorted, new ArrayList<>());
        //     }
        //     map.get(sorted).add(s);
        // }

        // ans.addAll(map.values());
        // return ans;
        
    }

    private double getHash(String str){
        double hash = 1d;
        for(char c : str.toCharArray()){
            hash *= primeArr[c - 'a'];
        }
        return hash;
    }
}