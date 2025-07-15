public class Solution {
    public bool IsIsomorphic(string s, string t) {
        if(s.Length != t.Length)
           return false;
        var hashMap = new Dictionary<char,char>();
        var hashSet = new HashSet<char>();
        for(var i=0;i<s.Length;i++){
            if(hashMap.ContainsKey(s[i]))
            {
                if(hashSet.Contains(t[i]))
                {
                    if(hashMap[s[i]] != t[i])
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }

            }
            else
            {
               hashMap.Add(s[i],t[i]);
               hashSet.Add(t[i]);   
            }
        }
        return true;     
    }
}