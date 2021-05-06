// Time Complexity :O(n*k), n= length of input array "strs" and k=average length of words in input array
// Space Complexity :O(2n)=> O(n), n=no of words in input array
// Did this code successfully run on Leetcode : yes
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //if empty input
        if (strs == null || strs.length == 0) {
            //return empty list
            return new ArrayList<>();
        }

        //map to store anagrams
        HashMap<Long, List<String>> map = new HashMap<>();
        //looping through all words in the list
        for (String word : strs) {

            //claculating primeProduct corresponing to input word
            long key = primeProduct(word);

            //if anagram key doesn't exist in map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // add anagram to list
            map.get(key).add(word);

        }
        // return list of anagrams
        return new ArrayList<>(map.values());
    }

    public long primeProduct(String strs) {
        // array of primes corresponding
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        //claculating product of all the prime corresponding to characters in string
        long res=1;
        for(int i=0; i<strs.length(); i++){
            char c = strs.charAt(i);
            res = res * prime[c-'a'];
        }

        return res;
    }
}