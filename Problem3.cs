public class WordPattern
    {
        // Time Complexity : O(1) -- i think its constant time as the length of the entire string s is 3000 and t is 300
        // Space Complexity : O(1) -- since the max value in hashmap can be 26 key value pairs
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No

                                        //abba  dog cat cat dog
        public bool WordPattern1(string pattern, string s)
        {
            if (s == null && pattern == null) return true;
            if (s == null || pattern == null) return false;

            string[] strArray = s.Split(' ');
            if (pattern.Length != strArray.Length) return false;

            Dictionary<char, string> patternMap = new Dictionary<char, string>();
            HashSet<string> strSet = new HashSet<string>();

            char[] patternArr = pattern.ToCharArray();

            for (int i = 0; i < patternArr.Length; i++)
            {
                //check if pattern character contains in hashmap
                if (patternMap.ContainsKey(patternArr[i]))
                {
                    if (patternMap[patternArr[i]] != strArray[i]) return false; //if pattern hashmap value and word in the string s does not match
                }
                else
                {
                    //check hashset contains the word in the string s
                    if (strSet.Contains(strArray[i]))
                    {
                        return false;
                    }
                    else
                    {
                        //add the pattern character and the word in the string s to dictionary
                        patternMap.Add(patternArr[i], strArray[i]);

                        //add the word in string s to the hashset
                        strSet.Add(strArray[i]);
                    }
                }
            }
            return true;
        }
    }
