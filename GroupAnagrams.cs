public class Solution {
//     Time complexity is O(N × K) 
//      Space complexity is O(N × K)
    public IList<IList<string>> GroupAnagrams(string[] strs) {

    List<List<string>> list = new List<List<string>>();
    var dict = new Dictionary<string,List<string>>();
    for(int i=0;i<strs.Length;i++)
    {
       string freq =  GetFrequency(strs[i]);
        if(!dict.ContainsKey(freq))
        {
            dict.Add(freq,new List<string>(){strs[i]});
        }
        else
        {
            dict[freq].Add(strs[i]);
        }

    }
   var result = new List<IList<string>>();
      foreach(var res in dict.Values)
      {
        result.Add(res);
      }
      return result;

    }
    public string GetFrequency(string str)
    {
        int[] ar = new int[26] ;
        StringBuilder sb = new StringBuilder();
        foreach(char c in str)
        {
            ar[c - 'a']++;
        }
       
    for (int i = 0; i < 26; i++)
    {
         if (ar[i] > 0)
        {
            sb.Append((char)(i + 'a'));
            sb.Append(ar[i]);
        }
    }
    return sb.ToString();
    
// c - 'a' = 101 - 97 = 4
// i = 4
// 'a' = 97

// 4 + 97 = 101
// (char)101 = 'e'


    //===== 2nd Approach by sorting a string
    //   List<List<string>> list = new List<List<string>>();
    //   var dict = new Dictionary<string,List<string>>();

    //   for(int i=0;i<strs.Length;i++)
    //   {

    //     char[] arr = strs[i].ToCharArray();
    //     Array.Sort(arr);
    //     string str = new string(arr);
        
        
    //     if(!dict.ContainsKey(str))
    //     {
    //         dict.Add(str,new List<string>(){strs[i]});
    //     }
    //     else
    //     {
    //         dict[str].Add(strs[i]);
    //     }

    //   }
    //   var result = new List<IList<string>>();
    //   foreach(var res in dict.Values)
    //   {
    //     result.Add(res);
    //   }
    //   return result;
    }

}


