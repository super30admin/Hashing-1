class Solution:
    def isIsomorphic(self, X: str, Y: str) -> bool:
        if len(X) != len(Y):
            return False
        d = {}
        s = set()

        for i in range(len(X)):
            print(d)
            print(s)
            x = X[i]
            y = Y[i]
            if x in d:
                if d[x] != y:
                    return False
            else:
                if y in s:
                    return False
            d[x] = y
            s.add(y)

        return True
