//time - O(n*klogk)
//space - O(nk)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return null;
        HashMap<String, List<String>> map = new HashMap();
        List<List<String>> result = new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<String>());
            }
            map.get(sortedStr).add(str);
        }

        for(String str : map.keySet()){
            result.add(map.get(str));
        }

        return result;
    }
}