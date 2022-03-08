package main

import (
	"sort"
	"strings"
)

/*
Problem 1:
Given an array of strings, group anagrams together.
Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
Note: All inputs will be in lowercase. The order of your output does not matter.



We need a way to group "like" terms
- So we need a map that says for this word: [ we have the following anagrams ]
- we could set up a nested loop and achieve it in o(n^2) time
- Finally, loop over the map and extract out all the lists into a 2D output array

optimization #1
- since anagrams are just permutations of a word, if sorted they will give us the ascending format
- if we run into another word who is a anagram of previously sorted word, then the sorted will result into the same exact prev word
- so our map then becomes { $sortedWord: [ unsorted-words-that-resulted-into-this-sorted-word ] }
- Finally, loop over the map and extract out all the lists into a 2D output array

Time:
- since we loop over all words -- o(n) - where n is the number of words in our input array
- then we sort each word - o(klogk) - where k is the length of word
- looping over final map - o(n) worse case is that no words are anagrams so our map size == array size
- o(n) x o(klogk) + o(n)
- o(nklogk) + o(n)
- o(nklogk)

Space:
- we constructed a map to do our searching and grouping in.
- o(n) space at worse case.


optimization #2 ( to avoid sorting )
- We need a way to group "like" terms
- We could write a custom hash function that purposefully yet safely clashes like "terms"
	- Could we create a sum of all ascii values of the input word?
	- This will surely beat o(klogk) sorting time since we will traverse k len string once
	- sum all ascii values of all characters in the input string?
	- This does not work
		- "ab" and "ba" are anagrams and sum of ascii values works here - purposefully colliding hash values to achieve grouping
		- "duh" and "ill" -- are not anagrams but their sum produce the same values.... so clashing but this type of clash we do not want

	- How are strings stored in hashmaps?
	- HashFunc(str)
		- $formFactor(position x primeNumber) x ascii value
	- we could use the product primeNumber trick in this case
	- primeProduct is essentially mapping a character to a prime number ( literally a static map )
	- then instead of summing all ascii values of all characters in word,
	- we will compute a prime product of all characters in the word.
	- This makes our anagrams "grouped" and also avoid collisions we saw with "duh" and "ill" using ascii sum.
*/
// using the sorted approach

func groupAnagrams(words []string) [][]string {
	if words == nil || len(words) == 0 {
		return nil
	}
	if len(words) == 1 {
		return [][]string{{words[0]}}
	}
	var out [][]string
	m := map[string][]string{}

	for _, word := range words {
		wordSlice := strings.Split(word, "")
		// sort takes o(klogk) - k is the len of the current string being sorted
		sort.Strings(wordSlice)
		sortedStr := strings.Join(wordSlice, "")
		m[sortedStr] = append(m[sortedStr], word)
	}

	// o(n) -- worse case if all words are distinct (i.e cannot be groupped into anagrams)
	// then we will end up with our map being the same size as the input arr - therefore o(n) time
	// space could also be o(n) if the above is true for worse case
	for _, v := range m {
		out = append(out, v)
	}

	return out
}

func groupingAnagramsUsingCustomHash(words []string) [][]string {
	m := map[float64][]string{}
	for _, s := range words {
		k := primeProduct(s)
		m[k] = append(m[k], s)
	}
	var out [][]string
	for _, v := range m {
		out = append(out, v)
	}
	return out
}

var primes = map[string]float64{
	"a": 2, "b": 3, "c": 5, "d": 7, "e": 11, "f": 13,
	"g": 17, "h": 19, "i": 23, "j": 29, "k": 31, "l": 37,
	"m": 41, "n": 43, "o": 47, "p": 53, "q": 59, "r": 61,
	"s": 67, "t": 71, "u": 73, "v": 79, "w": 83, "x": 89,
	"y": 97, "z": 101,
}

// o(k) -- where k is the len of the string word
func primeProduct(word string) float64 {
	var hash float64 = 1
	for _, char := range word {
		hash *= primes[string(char)]
	}
	return hash
}
