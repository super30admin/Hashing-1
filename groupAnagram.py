from collections import defaultdict

def groupAnagrams(strs):
        """
        #1. Brute Force Solution:
        Traverse through strs, call sorted strs[i] store into var.
        Every next element list sort str and compare with sorted element, if match found keep storing into result
        Return Final result.
        eg. ["eat","tea","tan","ate","nat","bat"]
        onsorted eat -> aet and tea -> aet. Comparison will give you a match. append into res[0]. If mismatch found append to res.
        res = [[eat]]
       ### Time Complexity: O(N.NLog(N))
        NLog(N) to call sorted() everytime.
       ### Space Complexity: O(N)

        #2. Optimized solution:
        Utilize defaultdict from python. We are improving previous solution by reducing 
        ### Time Complexity: O(K.Nlog(N)) -> O(N.log(N))
        ### Space Complexity: O(N)
        # passed on leetcode

        """
        words_dict = defaultdict(list)
        result=[]
        for i in strs:
            key=sorted(i) #O(Nlog(N))
            value=''.join(key) #O(1)
            words_dict[value].append(i) #O(1)
        
        for i in words_dict.values():
            result.append(i) #O(1)
        
        return result