'''
Firstly, I convert the string 's' into a list of words without spaces. And similar to the last problem I use a
hashtable and a hashset. The hashtable stores elements in the pattern and corresponding replacement in the string
as key,value pairs. Whenever, I form a key,value pair, I add the corresponding value into the hashset to prevent
multiple words from having the same key
'''


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        string = s.split(' ')
        pattern = list(pattern)
        maps = defaultdict(str)
        values = set()

        if len(pattern) != len(string):
            return False

        for i in range(len(pattern)):
            a = pattern[i]
            b = string[i]

            if maps[a]:
                if maps[a] == b:
                    continue
                else:
                    return False
            else:
                if b not in values:
                    maps[a] = b
                    values.add(b)
                else:
                    return False

        return True