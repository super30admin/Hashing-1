using System;
using System.Collections.Generic;

namespace Algorithms
{
    public class Isomorphic
    {
        /// Time Complexity : O(n) 
        // Space Complexity :O(n)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Referred Online
        public bool IsIsomorphic(string s, string t)
        {
            Dictionary<char, char> map = new Dictionary<char, char>();
            HashSet<char> assignedValues = new HashSet<char>();

            for(int i =0; i < s.Length; i++)
            {
                if(map.ContainsKey(s.ToCharArray()[i]) && map.GetValueOrDefault(s.ToCharArray()[i]) != t.ToCharArray()[i])
                {
                    return false;
                }
                if(!map.ContainsKey(s.ToCharArray()[i]) && assignedValues.Contains(t.ToCharArray()[i]))
                {
                    return false;
                }
                if (!map.ContainsKey(s.ToCharArray()[i]))
                {
                    map.Add(s.ToCharArray()[i], t.ToCharArray()[i]);
                }
                if (!assignedValues.Contains(t.ToCharArray()[i]))
                {
                    assignedValues.Add(t.ToCharArray()[i]);
                }
                
            }
            return true;
        }
    }
}
