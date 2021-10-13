// Time complexity is O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode: Yes (https://leetcode.com/submissions/detail/570807667/)
// Any problem you faced while coding this:
using System;
using System.Collections.Generic;
using System.Linq;

namespace Group_Anagrams
{
    class Program
    {
        public IList<IList<string>> GroupAnagrams(string[] strs) {
        Dictionary<double, IList<String>> dict = new Dictionary<double, IList<String>>();
        
        foreach(String s in strs) {
            double key = GetPrimeKey(s);
            
            if(! dict.ContainsKey(key)) {
                List<String> newString = new List<String>();
                newString.Add(s);
                dict.Add(key, newString);
            } else {
                 (dict[key]).Add(s);
            }
        }
        return dict.Values.ToList();
    }
    
    double GetPrimeKey(String str) {
        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,                                            73, 79, 83, 89, 97, 101};
        double key = 1;
        foreach(char c in str) {
            key = key * prime[c - 'a'];
        }
        return key;
    }
        static void Main(string[] args)
        {
            string[] strs = new string[] {"eat","tea","tan","ate","nat","bat"};
            Program p = new Program();
            var result = p.GroupAnagrams(strs);
        }
    }
}
