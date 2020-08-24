from collections import defaultdict
class solution:
    def __init__(self, array):
        self.array = array

    def anagram(self):
        d = defaultdict(list)

        for word in self.array:
            temp = [0]*26
            for w in word:
                temp[ord(w) - ord('a')] += 1
            d[tuple(temp)].append(word)
        return [d[k] for k in d]

array = ["eat", "tea", "tan", "ate", "nat", "bat"]

new = solution(array)
print(new.anagram())