public class Solution {
    //Time Complexity - O(n)
    //Space Complexity - O(n)

    public bool IsIsomorphic(string s, string t)
    {
        if (s.Length != t.Length)
            return false;


        var dict1 = new Dictionary<char, char>();
        var dict2 = new Dictionary<char, char>();
        for (int i = 0; i < s.Length; i++)
        {
            if (dict1.ContainsKey(s[i]))
            {
                if (dict1[s[i]] != t[i])
                    return false;
            }
            else
            {
                dict1.TryAdd(s[i], t[i]);
            }

            if (dict2.ContainsKey(t[i]))
            {
                if (dict2[t[i]] != s[i])
                    return false;
            }
            else
            {
                dict2.TryAdd(t[i], s[i]);
            }

        }
        return true;
        
    //Time Complexity - O(n^2)
        //Space Complexity - O(n)
        // public bool IsIsomorphic(string s, string t) {
        //     if (s.Length != t.Length)
        //         return false;


        //     var dict = new Dictionary<char,char>();
        //     for(int i=0;i<s.Length;i++)
        //     {
        //         if(!dict.ContainsKey(s[i]))
        //         {
        //             if(!dict.ContainsValue(t[i]))
        //             {
        //                 dict.TryAdd(s[i],t[i]);
        //             }
        //             else
        //             {
        //                 return false;
        //             }
        //         }
        //         else
        //         {
        //              if(dict[s[i]]!=t[i])
        //              {
        //                 return false;
        //              }
        //         }
        //     }
        //     return true;

    }
}


