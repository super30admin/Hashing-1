
# time O(n), space O(n)

# create two maps of pattern to word and word to pattern, if there is a mismatch, return False
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        arr = s.split()
        n = len(arr)
        k = len(pattern)

        if n!=k:
            return False
        
        pMap = {}
        # { a: dog, b:cat }
        sMap = {}
        # { dog: a, cat:a }
        # arr = [dog,cat,cat,dog]
        for i in range(len(arr)):
            # a
            a = pattern[i]

            if a not in pMap:
                pMap[a]=arr[i]
            else:
                if pMap[a] != arr[i]:
                    return False
            
            if arr[i] not in sMap:
                sMap[arr[i]]=a
            else:
                if sMap[arr[i]]!=a:
                    return False
        
        return True 