class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
	//return Empty if empty strs array 
        if(strs.length == 0 ) return new ArrayList();
        Map <String,List> result = new HashMap<String,List>();
        for(String s: strs){
           char c[] =s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
                       
           if(!result.containsKey(key))
                result.put(key,new ArrayList()); // add new list to hashmap
               result.get(key).add(s); //always adding to list 
                       
        }
        return new ArrayList(result.values());
    }
}

//TimeComplexity 
//Sorting each element O(logn) * O(n) = O(nlogn)
//Space complexity 
//Added new Arraylist hence O(n)  
