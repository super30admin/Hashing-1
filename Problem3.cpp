// Approach:
// Split the input string into words and compare the mapping between pattern and words using two hash maps.
// Ensure one-to-one consistent mappings in both directions (char->word and word->char).
// If mapping breaks or sizes mismatch, return false.

#include <iostream>
#include <sstream>
#include <unordered_map>
#include <vector>

using namespace std;

bool wordPattern(string pattern, string str) {
    istringstream iss(str);
    vector<string> words;
    string word;

    while (iss >> word)
        words.push_back(word);

    if (pattern.length() != words.size())
        return false;

    unordered_map<char, string> charToWord;
    unordered_map<string, char> wordToChar;

    for (int i = 0; i < pattern.length(); ++i) {
        char c = pattern[i];
        string w = words[i];

        if (charToWord.count(c) && charToWord[c] != w)
            return false;
        if (wordToChar.count(w) && wordToChar[w] != c)
            return false;

        charToWord[c] = w;
        wordToChar[w] = c;
    }

    return true;
}

int main() {
    cout << "Pattern: abba, String: 'dog cat cat dog' -> " << (wordPattern("abba", "dog cat cat dog") ? "True" : "False") << endl;
    cout << "Pattern: abba, String: 'dog cat cat fish' -> " << (wordPattern("abba", "dog cat cat fish") ? "True" : "False") << endl;
    cout << "Pattern: aaaa, String: 'dog cat cat dog' -> " << (wordPattern("aaaa", "dog cat cat dog") ? "True" : "False") << endl;
    cout << "Pattern: abba, String: 'dog dog dog dog' -> " << (wordPattern("abba", "dog dog dog dog") ? "True" : "False") << endl;
    return 0;
}
