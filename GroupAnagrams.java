// Time Complexity : O(n * l) where n are number of strings and l is the average length of each string
// Space Complexity : O(n) for Hashmap
// Method : Hashing

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList();
        HashMap<Double, List<String>> map = new HashMap();

        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        double count;

        for(String str : strs)
        {
            count = 1;

            for(int i = 0; i < str.length(); i++)
            {
                count *= primes[str.charAt(i) - 'a'];
                System.out.println(count);
            } 

            System.out.println("Hello");

            if(!map.containsKey(count)) map.put(count, new ArrayList());

            map.get(count).add(str);
        }

        for(Map.Entry<Double, List<String>> entry : map.entrySet())
            result.add(entry.getValue());
        
        return result;
    }
}