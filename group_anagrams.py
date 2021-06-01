class Solution:
    '''
    Time complexity: O(n)
    Space complexity: O(n)
    '''
    def groupAnagrams(self, strs):
        # create a dict to keep everything
        keys = {}
        res = []

        for s in strs:
            # you can create a key using the sorted_str
            sorted_str = "".join(sorted(s))

            if sorted_str in keys:
                keys[sorted_str].append(s)
            else:
                keys[sorted_str] = [s]

        for key in keys:
            res.append(keys[key])

        return res