# Time Complexity : O(mn)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


from typing import List

# Basic algorithm using sorted words -> n * m Log(m)
# def group_anagrams(strs: List[str]):
#     hashmap = {}
#     for word in strs:
#         sorted_arr = sorted(word)
#         sorted_word = ''.join(sorted_arr)
#         if sorted_word not in hashmap:
#             hashmap[sorted_word] = [word]
#         else:
#             hashmap[sorted_word] = hashmap[sorted_word] + [word]
#     arr = [value for value in hashmap.values()]
#     return arr


def is_prime(num):
    if num > 1:
        for i in range(2, int(num / 2) + 1):
            if (num % i) == 0:
                return False
        else:
            return True


def create_prime_range(num: int):
    prime_numbers = []
    starting_number = 2
    while len(prime_numbers) != num:
        if is_prime(starting_number):
            prime_numbers.append(starting_number)
        starting_number += 1
    return prime_numbers


def create_prime_hash():
    prime_numbers = create_prime_range(26)
    prime_hash = {}
    for one in range(97, 123):
        key = chr(one)
        value = prime_numbers[97 - one]
        prime_hash[key] = value
    return prime_hash


def group_anagrams(strs: List[str]):
    hashmap = {}
    prime_hash = create_prime_hash()
    for word in strs:
        calc_sum = 1
        for c in word:
            calc_sum *= prime_hash[c]
        if calc_sum not in hashmap:
            hashmap[calc_sum] = [word]
        else:
            hashmap[calc_sum] = hashmap[calc_sum] + [word]
    arr = [value for value in hashmap.values()]
    return arr


print(group_anagrams(['']))