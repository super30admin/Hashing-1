class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if pattern is None or s is None:
            return False
        ptlist = [x for x in pattern]
        inputlist = s.split(' ')
        if len(ptlist) != len(inputlist):
            return False 

        hmap1 = {}
        hmap2 = {}

        for i,p in enumerate(ptlist):
            if p not in hmap1:
                hmap1[p] = inputlist[i]
            else:
                if hmap1[p] != inputlist[i]:
                    return False

        for i,p in enumerate(inputlist):
            if p not in hmap2:
                hmap2[p] = ptlist[i]
            else:
                if hmap2[p] != ptlist[i]:
                    return False
        
        return True
