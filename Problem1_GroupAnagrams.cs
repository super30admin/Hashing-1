// Time Complexity :O(n*k*logk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Grouping Anagrams using sorting -> O(n*k*logk)
public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        var result = new List<IList<string>>();
        if(strs == null || strs.Length == 0) {
            return result;
        }
        Dictionary<string, List<string>> hashMap = new Dictionary<string, List<string>>();
        foreach(String str in strs) {
            char[] arr = str.ToCharArray();
            Array.Sort(arr);
            string sortedStr = String.Join("", arr);
            if(hashMap.TryGetValue(sortedStr, out var vals)) {
                vals.Add(str);
            }
            else {
                hashMap.Add(sortedStr, new List<string>{str});
            }
        }

        foreach(var entry in hashMap)
        {
            result.Add(entry.Value);
        }
        return result;
    }
}

// Time Complexity :O(n*k)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
//Grouping Anagrams without sorting -> O(n*k)
public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        var result = new List<IList<string>>();
        if(strs == null || strs.Length == 0) {
            return result;
        }
        int[] primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 
        59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Dictionary<string, List<string>> hashMap = new Dictionary<string, List<string>>();
        foreach(String str in strs) {
            string strKey = GetStringKey(str, primeNumbers);
            if(hashMap.TryGetValue(strKey, out var vals)) {
                vals.Add(str);
            }
            else {
                 hashMap.Add(strKey, new List<string>{str});
            }
        }

        foreach(var entry in hashMap)
        {
            result.Add(entry.Value);
        }
        return result;
    }

    private string GetStringKey(string str, int[] primeNums)
    {
        long product = 1;
        char[] arr = str.ToCharArray();
        foreach(var letter in arr) {
            product *= primeNums[letter - 'a'];
        }
        return product.ToString();
    }
}
