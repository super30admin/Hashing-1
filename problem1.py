#Group Anagrams#
class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        anagram_dict = dict()
        for i in strs:
            sorted_str = "".join(sorted(i))
            if sorted_str not in anagram_dict:
                anagram_dict[sorted_str] = []
            anagram_dict[sorted_str].append(i)
        return list(anagram_dict.values())


if __name__ == "__main__":
    arr = ["eat", "tea", "tan", "ate", "nat", "bat"]
    ga = Solution()
    print(ga.groupAnagrams(arr))