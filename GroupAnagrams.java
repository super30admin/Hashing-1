class Solution {

    // Method 1 - Using Sort and HashMap
    // Time Complexity -> O(nklog(k)), where n is the length of strs, and k is average length of a word inside strs.
    //Space Complexity -> O(nk)
    /** Steps:
    1. Sort, each word
    2. Group them in a list for the sorted word as a key
    3. Return the values as a list
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] wordArray = strs[i].toCharArray();
            Arrays.sort(wordArray);
            //Made mistake -> Wrote toString to convert char array to String
            String word = String.valueOf(wordArray);
            if(!map.containsKey(word))
                map.put(word, new ArrayList<>());
            map.get(word).add(strs[i]);
        }
        return new ArrayList<>(map.values());
        
    }

    //Method 2 - Prime Factor
    // Time Complexity -> O(nk), where n is the length of strs, and k is average length of a word inside strs.
    //Space Complexity -> O(nk)
    /** Steps:
    1. Calculate prime factor for each word. The anagrams would have same pf.
    2. Group every word in a list for the pf as a key
    3. Return the values as a list
     */
    public List<List<String>> groupAnagramsByPrimeFactor(String[] strs) {
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }

        Map<Double, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            double pf = primeFactor(strs[i]);
            if(!map.containsKey(pf)){
                map.put(pf, new ArrayList<>());
            }
            map.get(pf).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

    public Double primeFactor(String s){
        int[] primeNos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double res = 1;
        if(s == null || s.length() == 0) return res;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            res *= primeNos[c - 'a'];
        }
        return res;
    }
}
