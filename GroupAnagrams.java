// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> anagramMap = new HashMap<>();
        for (String word : strs) {
            double primeProduct = calcualtePrimeProduct(word);
            if (!anagramMap.containsKey(primeProduct)) {
                anagramMap.put(primeProduct, new ArrayList<>());
            }
            }
            anagramMap.get(primeProduct).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }

    private double calcualtePrimeProduct(String s) {
        int[] primeMap = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        char[] charStr = s.toCharArray();
        double result = 1;
        for (char ch : charStr) {
            int primeValue = primeMap[ch - 'a'];
            result *= primeValue;
        }
        return result;
    }
}