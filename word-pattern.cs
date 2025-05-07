// Time complexity is O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode: Yes (https://leetcode.com/submissions/detail/570158347/)
// Any problem you faced while coding this:

using System;
using System.Collections;

namespace word_pattern
{
    class Program
    {
        public static bool WordPattern(string pattern, string s) {
        Hashtable hashTable = new Hashtable();
        String[] sArr = s.Split(" ");
        if(pattern.Length != sArr.Length) {
            return false;
        }
        for(int i =0; i < pattern.Length; i++) {
            if (!hashTable.ContainsKey(pattern[i])) {
                if(!hashTable.ContainsValue(sArr[i])) {
                    hashTable.Add(pattern[i], sArr[i]);
                }
                else {
                    return false;
                }
            } else {
                //check if the pattern at i is equal to corresponsing s
                if(! hashTable[pattern[i]].ToString().Equals(sArr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
        static void Main(string[] args)
        {
            String pattern = "aaa";
            String s = "aa aa aa aa";
            Console.WriteLine(Program.WordPattern(pattern, s));
        }
    }
}
