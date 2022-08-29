def word_pattern(pattern, str):
    str_list = str.split(" ")
    if len(pattern) != len(str_list):
        return False

    hm1, hm2 = {}, {}
    for i in range(len(pattern)):
        c1, c2 = pattern[i], str_list[i]
        if c1 in hm1 and hm1[c1] != c2 or c2 in hm2 and hm2[c2] != c1:
            return False
        hm1[c1] = c2
        hm2[c2] = c1

    return True
