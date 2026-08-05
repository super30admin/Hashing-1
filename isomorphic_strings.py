"""
Approach:
-> Isomorphic strings means string1 can be transformed into string2 and string 2 can be transformed into string1 by replacing each character with another character.
-> Key idea is to have two way connection or mapping between the two strings. We can use two hashmaps to store the mapping of characters from string1 to string2 and vice versa.
-> We iterate through the characters of both strings and check if the mapping exists in both hashmaps. If it does, we check if the mapping is consistent; If mapping is not consistent, we return False. Otherwise, if mapping exists and is consistent, we add the mapping to both hashmaps.

Time Complexity:
O(N) where N is the length of the input strings.

Space Complexity:
O(N) where N is the length of the input strings. We are using two hashmaps to store the mapping of characters from string1 to string2 and vice versa.
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap, tMap = {}, {}

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]

            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            sMap[sChar] = tChar

            if tChar in tMap:
                if tMap[tChar] != sChar:
                    return False
            tMap[tChar] = sChar
        return True