class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        p_w={}
        s = s.split()
        if len(pattern) != len(s):
            return False
        for inex,p in enumerate(pattern):
            w = s[inex]
            print(p,w)
            if p not in p_w and w not in p_w.values():
                p_w[p]=w
            elif p_w.get(p)!=w:
                return False
        return True