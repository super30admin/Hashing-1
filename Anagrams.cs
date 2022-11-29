// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes

public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        
           if(strs.Length == 0 || strs == null)
              return new List<IList<string>>();
        
        Dictionary<string, List<string>> sMap = new Dictionary<string, List<string>>();
        
        for(int i = 0; i < strs.Length; i++)
        {
            Char[] ch = strs[i].ToCharArray();            
            Array.Sort(ch);
            string sorted = new string(ch);
           
            if(!sMap.ContainsKey(sorted))
            {
                sMap.Add(sorted, new List<string>()) ;
            }             
            sMap[sorted].Add(strs[i]);            
        }       
        
        return new List<IList<string>>(sMap.Values);
        
    }
}
