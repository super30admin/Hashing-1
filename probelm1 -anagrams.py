lass Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = {}
        for str in strs:
            str = str.lower()
            sstr = ''.join(sorted(str))
            if sstr not in hmap:
                hmap[sstr] = [str]
            else:
                hmap[sstr].append(str)

        result = []
        for value in hmap.values():
            result.append(value)
        print(result)
        return result