using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace S30_Problems
{
    class Program
    {
        static void Main(string[] args)
        {
            Program p = new Program();
            bool res = p.PatternMatch("abba", "dog dog dog dog");
        }

        // Time Complexity = O(M+n)
        // Space Complexity = O(n + n*k) where where k is the average length of the words in the strs string. 
        public bool PatternMatch(string Pattern, string strs) {
            string[] strArr = strs.Split(" ");  // O(M) where M in total number of chars in strs
            if (Pattern.Length != strArr.Length) return false;
            Dictionary<char, string> dict = new Dictionary<char, string>();
            HashSet<string> set = new HashSet<string>();
            for (int i = 0; i < Pattern.Length; i++) // O(n)
            {
                if (dict.ContainsKey(Pattern[i]) && dict[Pattern[i]] != strArr[i]) return false;
                if (!dict.ContainsKey(Pattern[i]) && set.Contains(strArr[i])) return false;
                if (!dict.ContainsKey(Pattern[i]))
                {
                    dict.Add(Pattern[i], strArr[i]);
                    set.Add(strArr[i]);
                }
            }
            return true;
        }

        // Time Complexity = O(n*k + n)
        // Space Complexity = O(n + (26*2)) where 26*2 is used for the stringbuilder to store 26 #s and 26 numbers
        public IList<IList<string>> GroupAnagrams(string[] strs)
        {
            Dictionary<string, List<string>> dict = new Dictionary<string, List<string>>();
            foreach (string word in strs) // O(n)
            {
                int[] Count = new int[26];
                foreach (char letter in word) Count[letter-'a']++; // O(k) avg length of the word
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 26; i++) sb.Append("#").Append(Count[i]); // O(26)
                string text = sb.ToString();
                if (!dict.ContainsKey(text)) dict.Add(text, new List<string>());
                dict[text].Add(word);
            }
            IList<IList<string>> result = new List<IList<string>>(dict.Values.ToList()); // O(n)
            return result;
        }
      
        // Time Complexity = On)
        // Space Complexity = O(2n) 
        public bool IsIsomorphic(string s, string t)
        {
            Dictionary<char, char> numberNames = new Dictionary<char, char>();
            HashSet<char> myhash1 = new HashSet<char>();
            for (int i = 0; i < s.Length; i++) // O(n)
            {
                if (numberNames.ContainsKey(s[i]))
                {
                    if (numberNames[s[i]] != t[i]) return false;
                }
                else
                {
                    if (myhash1.Contains(t[i])) return false;
                    numberNames[s[i]] = t[i];
                    myhash1.Add(t[i]);
                }
            }
            return true;
        }
    }
}
