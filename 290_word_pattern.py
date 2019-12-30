class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        """
            // Time Complexity: O(m+n)
                # 'm' is the number of elements in 's' and
                # 'n' is the number of elements in 't'
            // Space Complexity:
                O(n) We have a dictionary and the zip list
            // Did this code successfully run on Leetcode :
                Yes
            // Any problem you faced while coding this :
                Not sure if the time complexities are right.
                Its tricky!
        """
        # O(n)
        arr_str = str.split()
        # O(1)
        if len(pattern) != len(arr_str):
            return False
        # O(n) and O(1)
        if len(set(pattern)) != len(set(arr_str)):
            return False
        # O(m+n)
        values = list(zip(pattern, arr_str))
        pattern_dict = {}
        # O(m+n)
        for key, value in values:
            # O(1) and O(1)
            if key in pattern_dict and pattern_dict[key] != value:
                return False
            else:
                # O(1)
                pattern_dict[key] = value
        return True


if __name__ == '__main__':
    h = Solution()
    print(h.wordPattern("abba", "dog cat cat dog"))
    print(h.wordPattern("aaaa", "dog cat cat dog"))
    print(h.wordPattern("abba", "dog dog dog dog"))
    print(h.wordPattern("aaaa", "dog cat cat dog"))
    print(h.wordPattern("aba", "cat cat cat dog"))
