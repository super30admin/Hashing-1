// Grouping Anagrams together

// Time-Complexity- O(n*mlog(m)) 
// Space Complexity-O(n)
// passed test cases on leetcode-yes
// faced problem-no


class GrpAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //if string array length is 0 then return empty list
        if(strs.length==0) return new ArrayList();
        
        //creating a hashmap to store anagrams 
        Map<String,List> ans=new HashMap<String,List>();
        
        //iterating through every string
        for(String s:strs){
            char[] ca=s.toCharArray();
            //sorting the string
            Arrays.sort(ca);
            String key=String.valueOf(ca);
            //checking if hashamp don't have key 
            if(!ans.containsKey(key)){
                //creating a new entry with sorted string and empty arraylist to store for future purposes
                ans.put(key,new ArrayList());
            }
            //adding the string in list to its sorted string which is key 
                ans.get(key).add(s);
        }
        //returning only the values of the hashmap which is a list
        return new ArrayList(ans.values());
        
        
    }