//Space complexity O(n*k) (k is avg length of each string and n is no of strings)
//Time complexity O(n*klog(k))
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> temp=new HashMap<>();
    
        for(String current:strs)
        {
            char[] charArr=current.toCharArray();
            Arrays.sort(charArr);
            String sorted=String.valueOf(charArr);
            if(!temp.containsKey(sorted))
            {
                temp.put(sorted,new ArrayList<>());
            }
            temp.get(sorted).add(current);
        }
        return new ArrayList<>(temp.values());
    }

}