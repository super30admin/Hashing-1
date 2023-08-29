// Leetcode problem : https://leetcode.com/problems/group-anagrams/description/
// Time Complexity : O(nklogk) where n is the total number of words in the array and k is the total number of alphabets. klogk - tc for sorting
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
 * I take each string and sort it. Then I check if the sorted string is present as a key in the map, if yes I append the original 
 * string to the value of that respective key in map. If not, I add the new key and create a new list with the original string as it's
 * value.
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0)
        {
            return new ArrayList<>();
        }
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char []c = str.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if(!map.containsKey(temp))
            {
                map.put(temp,new ArrayList<String>());
            }
            map.get(temp).add(str);
        }
        return new ArrayList<>(map.values());
    }
}


/*
 * Alternate method - Optimal TC
 */

// Time Complexity : O(nk) where n is the total number of words in the array and k is the total number of alphabets.
// Space Complexity : O(nk)

/*
 * Here, I assign a prime number to every alphabet of the English language. I then calculate the prime product of every string. If the product
 * is present in the hashmap, I append the string to it's corresponding value. If not, I add the product as the key and add the string 
 * in the form of a list.
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0)
        {
            return new ArrayList<>();
        }
        HashMap<Double, ArrayList<String>> map = new HashMap<>();
        for(String str : strs)
        {
            double product = primeFactor(str);
            if(!map.containsKey(product))
            {
                map.put(product,new ArrayList<String>());
            }
            map.get(product).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private double primeFactor(String str)
    {
        int []primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double product = 1;
        for(int i=0;i<str.length();i++)
        {
            product*=primes[str.charAt(i)-'a'];
        }
        return product;
    }
}