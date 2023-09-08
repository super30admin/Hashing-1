class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 
// Time complexity: n*k*log(k) where n is number of elements in the string and k is the number of elements in specific element of the array strs

        HashMap<String, ArrayList> map = new HashMap<>(); 

        for(int i=0;i<strs.length;i++)
        {
            String str = strs[i]; 
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray); // sorted string
            if(!map.containsKey(sortedStr))
            {
                map.put(sortedStr, new ArrayList<String>());
            }
            map.get(sortedStr).add(str);
        }

        return new ArrayList(map.values());
        
    }
}
