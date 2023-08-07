func wordPattern(pattern string, s string) bool {
    pS := map[byte]string{}
    sP := map[string]byte{}
    sSplit := strings.Split(s, " ")
    
    if len(sSplit) != len(pattern) {return false}
    
    for i := 0; i < len(sSplit); i++ {
        pChar := pattern[i]
        sWord := sSplit[i]
        
        val, ok := pS[pChar]
        if ok && val != sWord {return false}
        pS[pChar] = sWord
        
        val2, ok := sP[sWord]
        if ok && val2 != pChar {return false}
        sP[sWord] = pChar
    }
    return true
}
