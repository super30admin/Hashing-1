package Hashing_Problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 *Here we are hashing the string such that anagrams will have equal hash and using it as a key in the
 *hashmap to store strings that have same hashKey
 * 
 * Time Complexity :
 * O(nk) where n is the no of words and k is the avg length of each word
 * 
 * 
 * Space Complexity :
 * Space complexity is O(nk)
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 * 
 */

public class Problem1 {

	    int primes[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

		private BigInteger findHash(String word) {

			BigInteger hash = new BigInteger("1");

			for (int i = 0; i < word.length(); i++) {
				hash = hash.multiply(new BigInteger(Integer.toString(primes[word.charAt(i) - 'a'])));
			}
			return hash;
		}

		public List<List<String>> groupAnagrams(String[] strs) {
			HashMap<BigInteger, List<String>> map = new HashMap<BigInteger, List<String>>();
			for (String word : strs) {
				BigInteger hash = findHash(word);
				if (!map.containsKey(hash)) {
					map.put(hash, new ArrayList<String>());
				}
				map.get(hash).add(word);
			}

			return new ArrayList(map.values());
		}
}
