import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * @author Aditya sinha
 *
 */
//we will use prime numbers to get the hash value, result string is a collection of string list sharing same hash
//Time Complexity ; O(n * K) where n is the number of strings and K is the maximum length of a string
//Space Complexity : O(n * k)
//Did this code successfully run on Leetcode : Yes
public class GroupingAnagram {
	public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();

        for (String str : strs) {
            double hash = getHash(str);

            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }

            map.get(hash).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private double getHash(String str) {
        int[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
        };

        double hash = 1;

        for (char c : str.toCharArray()) {
            hash *= primes[c - 'a'];
        }

        return hash;
    }
}

class GroupingAnagramMain {
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		GroupingAnagram ga = new GroupingAnagram();
		System.out.println("Grouped Anagrams- " + ga.groupAnagrams(strs));
	}
}
