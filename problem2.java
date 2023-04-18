// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// We use only one HashMap in this solution.
// We need to maintain mappings from string t to string t and also from t to s. So we
//  add "s_" and "t_" before a key while adding in the map from s and t respectively.
//  if "s_"+key exists in map, we check if value = t[i] 
//  if("s_"+key ) not exists, we check if "t_"+t[i] is present in map and is matching with s[i].
//  else we add values to respective keys.




class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) 
        {
            return false;
        }
        HashMap<String,String>Map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            String str = s.substring(i,i+1);
            String ttr = t.substring(i,i+1);
            if(Map.containsKey("s_"+str)){
                if(!Map.get("s_"+str).equals(ttr)){
                    return false;
                }
            }
            else if(Map.containsKey("t_" + ttr ) && !Map.get("t_" + ttr ).equals(str))
            {
                return false;
            }
            else{
                Map.put("s_" + str, ttr);
                Map.put("t_"+ ttr , str);
            }
        }
        return true;

    }
}