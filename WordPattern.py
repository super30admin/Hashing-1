class Solution:
    def wordPattern(self, pattern, s):
        mapi = {}
        warray = s.split(' ')

        if len(warray) != len(pattern):
            return False

        for i in range(len(warray)):
            c = 'char_{}'.format(pattern[i])
            p = 'word_{}'.format(warray[i])

            if c not in mapi:
                mapi[c] = i
            if p not in mapi:
                mapi[p] = i
            # print(mapi)
            if mapi[p] != mapi[c]:
                return False
        return True
        