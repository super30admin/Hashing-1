from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        _dict = dict()
        for _str in strs:
            key = ''.join(sorted(_str))
            if not key in _dict:
                _dict[key] = []
            _dict[key].append(_str)
        return list(_dict.values())


if __name__ == '__main__':
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    print(Solution().groupAnagrams(strs))