// Time Complexity : O(n*klogk) where n is the length of input, k being max length of string
// Space Complexity :O(n*k) k being constant at 26 as lower case
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Store the anagrams in a key, value format
        //key to calculate
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            //count the num of times a char is appaearing in the string and put in TreeMap
            //It stores key-value in sorted order by key
            String key = "";
            char[] chs = str.toCharArray();
            Map<Character,Integer> innerMap = new TreeMap<>();
            for(char ch : chs)
            {
                int count = innerMap.getOrDefault(ch,0);
                count+=1;
                innerMap.put(ch,count);
            }
            // System.out.println(innerMap);
            //prepare the key by combining key, value
            //add # inbetween to differentiate between key values
            //not adding also works in this case
            for(Map.Entry<Character,Integer> entrySet : innerMap.entrySet())
            {
                char ch = entrySet.getKey();
                int val = entrySet.getValue();
                key = key + "#" + ch + "#" + val;
            }
            // System.out.println(key);
            List<String> list = map.getOrDefault(key, new LinkedList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}

// Time Complexity : O(n*k) where n is the length of input, k being max length of string->O(n)
// Space Complexity :O(n*k) k being constant at 26 as lower case->O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Same as before, diff is how we calculate key
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            //key calculation
            //as number of chars lower, can declare an array of 26 len, and keep track of each char
            String key = "";
            char[] chs = str.toCharArray();
            int[] count = new int[26];
            for(char ch : chs)
            {
                count[ch-'a']++;
            }
            //build key, # is imp to separate between each chars value as original char is not used
            for(int i = 0;i<26;i++)
            {
                int val = count[i];
                key += val + "#";
            }
            List<String> list = map.getOrDefault(key, new LinkedList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }
}