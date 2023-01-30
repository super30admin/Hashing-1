def group_anagrams(array):
    array_sets = []
    for a in array:
        for i in a:
            a_set = {}
            