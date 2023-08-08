// TC:O(nk)
// SC: O(nk)->n is length of hashmap and each hashmap value is a list
//solved in leetcode:YES


"""
Take a hashmap where key is the prime product refering to each value and value is the list of similar words with same prime product
"""

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> res = new HashMap<>();
        """It iterates number of strings as input times and each string it should be iterated to its length
        """
        for(String s:strs)
        {
            double hashed_value = calculate_hash(s);
            if(res.containsKey(hashed_value))
            {
                res.get(hashed_value).add(s);
            }
            else
            {
                List<String> group = new ArrayList<>();
                group.add(s);
                res.put(hashed_value,group);
            }
        }

        return new ArrayList<>(res.values());
    }
    """TC of this funcion is length of string lets say key
    """
    public double calculate_hash(String s)
    {
        int[] prime={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};

        double res =1;
        for(int i=0;i<s.length();i++)
        {
            int prime_val = prime[s.charAt(i)-'a'];
            res = res*prime_val;
        }
        return res;
    }
}