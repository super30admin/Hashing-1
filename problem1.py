# Sort each string in input array. considering this as key, add it's anagrams in the corresponding list
# Time: O(n * k log(k))
# Space: O(n)
def anagrams(input):
    staging_dict,result = {},[]

    for s in input:
        if ''.join(sorted(s)) in staging_dict:
            staging_dict[''.join(sorted(s))].append(s)
        else:
            staging_dict[''.join(sorted(s))] = [s]
    for k in staging_dict:
        result.append(staging_dict[k])
    return result

print(anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
