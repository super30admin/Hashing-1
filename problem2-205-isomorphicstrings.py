#Time Complexity :o(n)
#space complexity O(1)


def isIsomorphic(self, s: str, t: str) -> bool:
    s_to_t = {}
    t_to_s = {}
    for ch1, ch2 in zip(s, t):
        if ch1 not in s_to_t:
            s_to_t[ch1] = ch2
        else:
            if s_to_t[ch1] == ch2:
                pass
            else:
                return False

        if ch2 not in t_to_s:
            t_to_s[ch2] = ch1
        else:
            if t_to_s[ch2] == ch1:
                pass
            else:
                return False
    return True

#other ways

# we can use array and use ascii value to store mapping

#other approach is we can use map and other set and that we wwe can use use only one map