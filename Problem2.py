'''
1. We iterate through each character of the word s and maintain a dictionary mapped to the letter in same position in word t. 
2. If the letter was already present in the dictionary then we verify if they are same. Return false if not.
3. If entire array was traversed we return True

Time Complexity: O(n)
Space Complexity: O(n)
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        temp = {}

        for i in range(len(s)):
            if s[i] not in temp.keys() and t[i] not in temp.values():
                temp[s[i]] = t[i]
            else:
                if s[i] not in temp.keys() or t[i]!=temp[s[i]]:
                    return False

        return True