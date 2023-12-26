'''
I declare an empty hashtable and a hashset. The hashtable stores a word in 's' and its corresponding
replacement in 't'. The function of the hashset is to ensure no two values in 't' have the same replacement
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        a = list(s)
        b = list(t)
        char = defaultdict(str)
        values = set()

        for i in range(len(s)):
            s = a[i]
            t = b[i]

            if char[s]:
                if char[s] == t:
                    continue
                else:
                    return False
            else:
                if t not in values:
                    char[s] = t
                    values.add(t)
                else:
                    return False



        return True
