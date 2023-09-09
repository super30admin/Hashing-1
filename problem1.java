// ## Problem 1: Given an array of strings, group anagrams together. https://leetcode.com/problems/group-anagrams/

// Time Complexity : O(n*m) (m is strs.length and n is average size of strs[i])
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
// approach: Here we have used an approach where each character of the english alphabet has been represented by a prime number. This helps us becuase if we take product of the same letters, we will get a unique number irrespective of the order of letters. For each string we created this product and stored in a hashmap, the different lists in this hashmap were returned at the end.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if ( strs == null || strs.length==0)
        {
            return new ArrayList<>();
        }

        HashMap<Double, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++)
        {
            String str = strs[i];
            double product = primeProduct(str);

            if(!map.containsKey(product))
            {
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(str);
        }

        return new ArrayList<>(map.values());

    }

    double primeProduct(String str)
    {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        double result = 1;

        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            result *= prime[c-'a'];
        }
        return result;
    }
}