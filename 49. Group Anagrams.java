class Solution {
    // Method One - Hashmap with sorting
    // Time Complexity: O(nklog(k)), k indicates length of str in strs, n indicates the length of strs.
    // Space Complesity: O(nk)
    public List<List<String>> groupAnagrams_Method_One(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            // here we shoud create new arr for each str, so the length of space will be k, and we
            // have n str in strs, so the total will be nk.
            char[] arr = str.toCharArray();
            // here, we use sorting algorithm, on average, the best sorting algorithm will be klog(k),
            // and the k indicates the length of str, however we have n str in strs, so in the for loop,
            // the time complexity will be nklog(k).
            Arrays.sort(arr);
            String newStr = Arrays.toString(arr);
            System.out.println(newStr);
            if(map.containsKey(newStr)){
                map.get(newStr).add(str);
            }else{
                map.put(newStr, new ArrayList<>());
                map.get(newStr).add(str);
            }
        }
        // here we can directly invoke map.values() to return the result
        return new ArrayList(map.values());
        // // or we can iterate the map values and add it to new list, then return;
        // List<List<String>> res = new ArrayList<>();
        // for(List<String> val : map.values()){
        //     res.add(val);
        // }
        // return res;
    }
    
    // Method Two - Hashmap without sorting.
    // Time Complexity: O(nk)
    // Space Complexity: O(nk)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] arr = new int[26];
            for(char c : str.toCharArray()){
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            System.out.println(key);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}




















