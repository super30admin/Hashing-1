// Time Complexity: O(n × k) (n = number of words, k = average word length)
// Space Complexity: O(n)
// Explantion: We assign a unique prime number to each character from 'a' to 'z'. For every word, we multiply the prime values of its characters to generate a unique BigInteger key. Since anagrams produce the same prime product, we group words in a HashMap using this key. Finally, we return all grouped anagrams from the map.
import java.math.BigInteger;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int m = strs.length;
        if (m==0) return new ArrayList<>();
        if(m==1) {
            return Arrays.asList(Arrays.asList(strs[0]));
        } 
        Map<BigInteger, List<String>> map = new HashMap<>();
        int[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67,
            71, 73, 79, 83, 89, 97, 101
        };
        for (int i=0; i<m; i++) {
            String curr = strs[i];
            int currLength = curr.length();
            BigInteger multi = BigInteger.valueOf(1);
            for (int j =0; j<currLength; j++) {
                char s = curr.charAt(j);
                multi = multi.multiply(BigInteger.valueOf(primes[s - 'a']));
            }
            List<String> append;
            if(!map.containsKey(multi)) {
                append = new ArrayList(); 
            } else {
                append = map.get(multi);
            }
            append.add(curr);
            map.put(multi, append);
        }

        return new ArrayList<>(map.values());
        
        
    }
}