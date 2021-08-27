class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        D = {}
        line = s.split(' ')

        if len(line) != len(pattern):
            return False

        for x in range(len(line)):
            if pattern[x] not in D:
                if line[x] not in D.values():
                    D[pattern[x]] = line[x]
                else:
                    return False
            elif D[pattern[x]] != line[x]:
                return False

        return True