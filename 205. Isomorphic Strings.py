# Time Complexity O(n)
# Space Complexity O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        def helper(string):
            count = 0
            converted_s = []
            hash_map = {}
            for each in string:
                if each not in hash_map:
                    hash_map[each] = str(count)
                    count += 1
                converted_s.append(hash_map[each])
            return " ".join(converted_s)

        return helper(s) == helper(t)