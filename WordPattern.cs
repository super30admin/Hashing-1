public class Solution {
    
     //Time Complexity - O(n)
    //Space Complexity - O(n)
    public bool WordPattern(string pattern, string s)
    {
        //Optimal Approach
        string[] word = s.Split(' ');
        if (pattern.Length != word.Length)
            return false;

        Dictionary<char, string> pdict = new Dictionary<char, string>();
        Dictionary<string, char> sdict = new Dictionary<string, char>();

        for (int i = 0; i < word.Length; i++)
        {
            char ch = pattern[i];
            string str = word[i];
            if (pdict.ContainsKey(ch))
            {
                if (pdict[ch] != str)
                    return false;
            }
            else
            {
                pdict.TryAdd(ch, str);
            }

            if (sdict.ContainsKey(str))
            {
                if (sdict[str] != ch)
                    return false;
            }
            else
            {
                sdict.TryAdd(str, ch);
            }
        }
        return true;

        //first approach
        //Time Complexity - O(n^2)-containsValue for each iteration it runs n times
        //Space Complexity - O(n)
        // Dictionary<char,string> dict = new Dictionary<char,string>();
        // char[] arr = pattern.ToCharArray();
        // string[] star = s.Split(' ');
        // if(arr.Length != star.Length)
        // {
        //     return false;
        // }
        // for(int i=0;i<arr.Length;i++)
        // {
        //     if(!dict.ContainsKey(arr[i]))
        //     {
        //         if(!dict.ContainsValue(star[i]))
        //         {
        //             dict.TryAdd(arr[i],star[i]);
        //         }
        //         else
        //         {
        //             return false;
        //         }
        //     }
        //     else
        //     {
        //        if(dict[arr[i]] != star[i])
        //        {
        //         return false;
        //        }
        //     }
        // }
        // return true;
    }
}


