class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
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
        # creating set O(n)
        # comparison O(1)
        if len(set(s)) != len(set(t)):
            return False
        # zip function takes O(m+n)
        # the list functions takes O(n) to convert the
        # zip object to the list
        zipped = list(zip(s, t))
        results = {}
        # traversing O(m+n)
        for key, value in zipped:
            # to check if key exists O(1)
            # to check if value is similar O(1)
            if key in results and results[key] != value:
                return False
            else:
                # assign O(1)
                results[key] = value
        return True


if __name__ == '__main__':
    h = Solution()
    print(h.isIsomorphic("egg", "add"))
    print(h.isIsomorphic("ab", "aa"))
    print(h.isIsomorphic("foo", "bar"))
