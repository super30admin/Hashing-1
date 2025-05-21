# as per discussed in the class, maintained two different hashmaps
# one for source string and another for the destination
# key-value maintained for each character in source to each char in dest

smmap = {}
tmmap = {}

def is_isomorphic(s, t):
    for i in range(0, len(s)):
        if s[i] not in smmap:
            smmap[s[i]] = t[i]
        else:
            if smmap[s[i]] != t[i]:
                return False

    for j in range(0, len(t)):
        if t[j] not in tmmap:
            tmmap[t[j]] = s[j]
        else:
            if tmmap[t[j]] != s[j]:
                return False
    return True


if __name__ == "__main__":
    s = "foo"
    t = "bar"
    print(is_isomorphic(s,t))