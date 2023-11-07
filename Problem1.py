class GroupAnagrams:
  def group(self, arr):
    a_dict = dict()
    for i in arr:
    sorted = "".join(sorted(i))
    if sorted not in anagram_dict:
      a_dict[sorted] = []
      a_dict[sorted].append(i)
    return list(a_dict.values())
