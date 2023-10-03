public class Solution
    {
        // Time Complexity : O(n klogk) -- since we are going over the entire string array and sorting each string
        // Space Complexity : O(nk)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No

        public IList<IList<string>> GroupAnagrams(string[] strs)
        {
            IList<IList<string>> result = new List<IList<string>>();

            Dictionary<string, List<string>> map = new Dictionary<string, List<string>>();

            foreach (var s in strs)
            {
                char[] sArr = s.ToCharArray();
                Array.Sort(sArr);
                string sortedStr = new string(sArr);

                if(!map.ContainsKey(sortedStr))
                {
                    map.Add(sortedStr, new List<string>());
                }
                map[sortedStr].Add(s);
            }

            foreach (var item in map)
            {
                result.Add(item.Value);
            }

            return result;
        }
    }
