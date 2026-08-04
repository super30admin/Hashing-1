//Approach: The idea is to sort the strings and assign the sorted value as a key and the list of corresponding anagrams as a value in a HashMap
// This allows us to group all the related anagrams into a list assigned to corresponding sorted Key. At the end return values() of the map as a List.

// Time Complexity: O(nmlog(n))
// Space Complexity: O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++)
        {
            char[] strChar = strs[i].toCharArray();
            Arrays.sort(strChar);
            String keyStr = String.valueOf(strChar);

            if (map.containsKey(keyStr))
            {
                List<String> values = map.get(keyStr);
                values.add(strs[i]);
            }
            else
            {
                List<String> strList = new ArrayList<>();
                strList.add(strs[i]);
                map.put(keyStr, strList);
            }
        }

        return new ArrayList<>(map.values());
    }
}