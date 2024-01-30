'''
Time Complexity: O(n), length of the pattern/number of words in the phrase 
Space Complexity: O(n),we are using hashMap to store the mapping

This code works on leet code
'''


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        stringarr = s.split()
        # ps, sp={}, {} #create to hashMaps, one for pattern character and string mapping and other for string to pattern character mapping
        # if len(stringarr) != len(pattern): return false if lengths do not match.
        #     return False
        # for i in range(len(pattern)):
        #     if pattern[i] in ps and ps.get(pattern[i]) == stringarr[i] and stringarr[i] in sp and sp.get(stringarr[i]) == pattern[i]: # check the mapping consistency is maintained if we get a character that has been mapped
        #         continue #continue if the consistency is being maintained
        #     elif pattern[i] not in ps and stringarr[i] not in sp: # create the mapping if it is not present
        #         ps[pattern[i]] = stringarr[i]
        #         sp[stringarr[i]] = pattern[i]
        #     else:
        #         return False #else the consistency is being breached and hence the word pattern in not being followed.
        # return True

        ps, valSet={}, set()
        if len(stringarr) != len(pattern): #return false if lengths do not match.
            return False
        for i in range(len(pattern)):
            if pattern[i] in ps and ps.get(pattern[i]) == stringarr[i]: #check if the mapping exists and the mapping is kept conistent
                continue
            elif pattern[i] not in ps and stringarr[i] not in valSet: #create the mapping of the pattern character and string have not been mapped.
                ps[pattern[i]] = stringarr[i]
                valSet.add(stringarr[i])
            else:
                return False
        return True