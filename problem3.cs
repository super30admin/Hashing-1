public class Solution {
    public bool WordPattern(string pattern, string s) {
        string[] list = s.Split(' ');
        if(list.Length != pattern.Length)
           return false;
        var hashMap = new Dictionary<char,string>();
        var hashSet = new HashSet<string>();
        for(var i=0;i<pattern.Length;i++){
            if(hashMap.ContainsKey(pattern[i]))
            {
                if(hashSet.Contains(list[i]))
                {
                    if(hashMap[pattern[i]] != list[i])
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
               hashMap.Add(pattern[i],list[i]);
               hashSet.Add(list[i]);   
            }
        }
        return true;
        
    }
}