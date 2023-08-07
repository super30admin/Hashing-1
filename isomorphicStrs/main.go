// time = o(s)
// space = o(1) 26 chars in sT and 26 chars in tS ( constant )
func isIsomorphic(s string, t string) bool {
    sT := map[byte]byte{}
    tS := map[byte]byte{}
    for i := 0; i < len(s); i++ {
        sChar := s[i]
        tChar := t[i]
        
        val, ok := sT[sChar]
        if ok && val != tChar {return false}
        sT[sChar] = tChar
        
        val, ok = tS[tChar]
        if ok && val != sChar {return false}
        tS[tChar] = sChar
        
    }
    return true
}
