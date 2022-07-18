#Time Complexity : O(n)
#Space Complexity : O(1)

class Solution:

    def helper(self, x, y, l):
        d = dict()
        for i in range(0, l):
            if x[i] in d:
                if d.get(x[i]) != y[i]:
                    return False
            else:
                d.update({x[i]: y[i]})

        return True

    def wordPattern(self, pattern: str, s: str) -> bool:
        li = s.split(" ")
        print(li)

        if len(li) != len(pattern):
            return False

        if self.helper(pattern, li, len(li)):
            if self.helper(li, pattern, len(li)):
                return True
            else:
                return False

        else:
            return False
