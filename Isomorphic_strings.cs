// Time complexity is O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode: Yes (https://leetcode.com/submissions/detail/570298889/)
// Any problem you faced while coding this:

using System;
using System.Collections;

namespace Isomorphic_Strings
{
    class Program
    {
        public static bool IsIsomorphic(string s, string t) {
        Hashtable hashtable = new Hashtable();
        
        if(s.Length != t.Length) {
            return false;
        }
        
        for(int i=0; i< s.Length; i++) {
            if(! hashtable.ContainsKey(s[i])) {
                if(! hashtable.ContainsValue(t[i])) {
                    hashtable.Add(s[i], t[i]);
                }
                else {
                    return false;
                }
            } else if (! hashtable[s[i]].Equals(t[i])) {
                return false; 
            }
        }
        return true;
        
    }
        static void Main(string[] args)
        {
            String s="badc"; String t = "baba";
            Console.WriteLine(Program.IsIsomorphic(s, t));
        }
    }
}
