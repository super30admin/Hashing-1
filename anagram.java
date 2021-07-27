class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        Map<Long, List<String>> anagramMap = new HashMap<>();
        for(int i = 0; i< strs.length;i++){
            String s = strs[i];
            Long primeNumber = calculatePrimeNumber(s,primes);
            //Checking Existence
            if(!anagramMap.containsKey(primeNumber))
                anagramMap.put(primeNumber, new ArrayList<String>());
            //adding string to anagram list
            anagramMap.get(primeNumber).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
    private Long calculatePrimeNumber(String s , int[] primes){
        Long primeNumber = 1L;
        for(int i = 0;i< s.length();i++){
            primeNumber *= primes[s.charAt(i)-'a'];
        }
        return primeNumber;
    }
}