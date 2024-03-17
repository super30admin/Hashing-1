//Time Complexity: O(n * klogk), where n is the number of strings in the input array strs, and k is the maximum length of a string in strs.
//Space Complexity: O(n * k), where n is the number of strings in the input array strs, and k is the maximum length of a string in strs. 
//Code solved in leetcode: Yes
//Approach in 3 lines:
// This code groups anagrams from the input array `strs`.
// It sorts each string's characters to form a unique key, then stores strings with the same key in a HashMap.
// Finally, it returns a list containing all the grouped anagrams found in the HashMap.

public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        List<List<String>> result = new List<>();
        if(strs == null || strs.length == 0) return result;
        HashMap<string, List<string>> map = new HashMap<>();

        for(int i=0; i< strs.length; i++)
        {
            string s = strs[i];
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr); //klogk

            string sorted = string.valueOf(charArr);

            if(!map.containsKey(sorted)) // O(k)
            {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(s); // data structure inside another data strcuture is a reference
            
            // List<string> li = map.get(sorted); // instead of these 3lines above one line is enough
            // li.add(s);
            // map.put(sorted, li);


        }
        return new ArrayList<>(map.values()); // O(n)




    }
}