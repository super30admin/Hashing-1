//Time Complexity : O(n klogk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

// loop the string array and sort the add in map as a key and original as a value 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IsomorphicStrings {
	public List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();

		for (String s : strs) {

			char[] charArray = s.toCharArray();

			Arrays.sort(charArray);

			String sV = String.valueOf(charArray);

			if (!map.containsKey(sV)) {
				map.put(sV, new ArrayList<>());
			}

			map.get(sV).add(s);

		}

		return new ArrayList<>(map.values());

	}

//	TC- o(nk)
//	SC- o(nk)
	public List<List<String>> groupAnagramsWithPrimeProduct(String[] strs) {

		HashMap<Double, List<String>> map = new HashMap<>();

		for (String s : strs) { // 0(n)

			double primeProduct = primeProduct(s);

			if (!map.containsKey(primeProduct)) {
				map.put(primeProduct, new ArrayList<>());
			}
			map.get(primeProduct).add(s);

		}

		return new ArrayList<>(map.values());

	}

	private double primeProduct(String s) {

		double result = 0;

		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
				101, 103 };

		for (int i = 0; i < s.length(); i++) { // o(k)
			char c = s.charAt(i);
			int prime = primes[c - 'a'];// ascii 100-97 =3
			result *= prime;
		}

		return result;
	}
}

