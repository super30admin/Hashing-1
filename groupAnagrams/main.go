/* 
    we need to store like words together
    we need a way to identify like words

    N = number of words
    K = avg len of each word    
    
    approach #1; sort the word and use hash map to group them
    time= o(n) * o(klogk)
    space=o(nk)
    
    approach #2; a hash function that helps groupping anagrams
    - the hash func returns a string, which each char is replached by the freqcount of that char in a given word
    - the hash str will be all chars from a-z
    - each char will be replaced with a count value of each char of a given word to hash
    - example;
        hash(aaabbb)
        - strings.Join(["3", "3", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"], "")
        hash(bbbaaa)
        - strings.Join(["3", "3", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"], "")
    - this way our hash will group "like-words"
    - There is 1 edge case and that is
    - example;
        - hash(abbbbbbbbbbb) = 111.....remaining chars
        - hash(aaaaaaaaaaab) = 111.....remaining chars
        - The above two are NOT anagrams
        - but in this case, our hash func is saying they are.
    - Therefore, WE must separate the hash string with a separator to avoid above collision
        - hash(abbbbbbbbbbb) = 1-11.....remaining chars
        - hash(aaaaaaaaaaab) = 11-1.....remaining chars

    time = o(n) * o(k) to hash word + o(26) to store hash string
    space = o(nk)
    
*/ 
func groupAnagrams(strs []string) [][]string {
    m := map[string][]string{}
    for i := 0; i < len(strs); i++ {
        word := strs[i]
        hashKey := hashStr(word)
        m[hashKey] = append(m[hashKey], word)
    }
    out := [][]string{}
    for _, v := range m {
        out = append(out, v)
    }
    return out
}

func hashStr (word string) string {
    chars := []string{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}
    for i := 0; i < len(word); i++ {
        char := word[i]
        charIdx := char-'a'
        if chars[charIdx] >= "a" && chars[charIdx] <= "z" {
            chars[charIdx] = strconv.Itoa(1)
        } else {
            currIntVal, _ := strconv.Atoi(chars[charIdx])
            chars[charIdx] = strconv.Itoa(currIntVal+1)
        }
    }
    return strings.Join(chars, "-")
}
