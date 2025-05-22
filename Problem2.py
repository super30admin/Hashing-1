class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_iso_dict = {}
        t_iso_dict = {}
        for i in range(0,len(s)):
            key = s[i]
            value = t[i]

            if key not in s_iso_dict:
                s_iso_dict[key] = value
            else:
                if key in s_iso_dict and s_iso_dict[key] == value:
                    True
                else:
                    return False
            
            if value not in t_iso_dict:
                t_iso_dict[value] = key
            else:
                if value in t_iso_dict and t_iso_dict[value] == key:
                    continue
                else:
                    return False
        return True
        