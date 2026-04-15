class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Split s into words, then iterate through pattern and words together.
        # Use a hashmap for pattern-word mapping and a hashset to track used words.
        # If a pattern character already exists, its mapped word must match the current word.
        # If it is a new pattern character, the current word must not already be used.
        # If any condition fails, return False. Otherwise return True at the end.
        link = {}
        used = set()

        words = s.split()
        if len(pattern)!=len(words):
            return False
        for i in range(len(pattern)):
            if pattern[i] in link:
                if link[pattern[i]]!=words[i]:
                    return False
            else:
                if words[i] in used:
                    return False
                
                link[pattern[i]]=words[i]
                used.add(words[i])

        return True
