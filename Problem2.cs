public class Solution
    {
        // Time Complexity : O(n) -- since we are going over the entire string of s and t
        // Space Complexity : O(1) -- since the max value in hashmap can be 26 key value pairs
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No

        //using 2 hashmaps/dictionary
        public bool IsIsomorphic(string s, string t)
        {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;
            if (s.Length != t.Length) return false;

            Dictionary<char, char> sMap = new Dictionary<char, char>();
            Dictionary<char, char> tMap = new Dictionary<char, char>();

            char[] sArr = s.ToCharArray();
            char[] tArr = t.ToCharArray();

            for(int i = 0; i < sArr.Length; i++)
            {
                //check if s[i] contains in hashmap
                if(sMap.ContainsKey(s[i]))
                {
                    if (sMap[s[i]] != tArr[i]) return false; //if s hashmap value and t char does not match
                }
                else
                {
                    sMap.Add(sArr[i], tArr[i]);
                }

                //check if t[i] contains in second hashmap
                if(tMap.ContainsKey(t[i]))
                {
                    if (tMap[t[i]] != sArr[i]) return false; //if t hashmap value and s char does not match
                }
                else
                {
                    tMap.Add(tArr[i], sArr[i]);
                }
            }
            return true;
        }

        // Time Complexity : O(n) -- since we are going over the entire string of s and t
        // Space Complexity : O(1) -- since the max value in hashmap can be 26 key value pairs
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
  
        //using 1 hashmap and 1 hashset
        public bool IsIsomorphic2(string s, string t)
        {
            if (s == null && t == null) return true;
            if (s == null || t == null) return false;
            if (s.Length != t.Length) return false;

            Dictionary<char, char> sMap = new Dictionary<char, char>();
            HashSet<char> tSet = new HashSet<char>();

            char[] sArr = s.ToCharArray();
            char[] tArr = t.ToCharArray();

            for (int i = 0; i < sArr.Length; i++)
            {
                //check if s[i] contains in hashmap
                if (sMap.ContainsKey(s[i]))
                {
                    if (sMap[s[i]] != tArr[i]) return false; //if s hashmap value and t char does not match
                }
                else
                {
                    //check if t char is in Hashset
                    if(tSet.Contains(tArr[i]))
                    {
                        return false;
                    }
                    else
                    {
                        sMap.Add(sArr[i], tArr[i]);
                        tSet.Add(tArr[i]);
                    }
                }
            }
            return true;
        }

    }
