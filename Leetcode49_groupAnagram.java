//Time Complexity : O(nk)
//Space Complexity :O(1)
//Code executed on leetcode : yes 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
         
         for(int i=0;i<strs.length; i++)
         {
            String str = strs[i];
            Double hash = getHash(str);
            if(!map.containsKey(hash)){
              map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
         }

     return new ArrayList<>(map.values());  
     
    }

    private Double getHash(String str){
        int [] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result =1;
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            int pr = prime[c - 'a'];
            result=result*pr;
        }
        return result;
    }
}
