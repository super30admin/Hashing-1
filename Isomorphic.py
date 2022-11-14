class Solution:
    """
    Time complexity - O(n) n -> length of s/t
    Space complexity - O(n) n -> length of s/t
    """

    def isIsomorphic(self, s: str, t: str) -> bool:
        # s and t have same length
        mapped_chars = ""
        mapping = dict()
        for index in range(0, len(s)):
            if s[index] not in mapping:
                # if the char is not already used for mapping.
                if t[index] not in mapped_chars:
                    mapping[s[index]] = t[index]
                    mapped_chars += t[index]
                else:
                    return False
            # if char in s is already mapped, 
            # just verify if the mapping is still valid for current index.
            else:
                if t[index] != mapping[s[index]]:
                    return False
        return True
        