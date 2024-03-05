# Time and space complexity is O(N)
class GroupAnagrams:
    def anagrams(self, strs):
    dic = defaultdict(list)

    for s in strs:
        count = [0]*26
    for c in s:
        count[ord(c)-ord('a')] +=1
    dic[tuple(count)].append(s)
    return dic.values()