// Approach:
// Use two hash maps to track character mappings from s to t and t to s to enforce one-to-one mapping.
// If a mismatch is found in either map, return false.
// If all mappings are consistent, return true.

#include <iostream>
#include <unordered_map>
using namespace std;

bool isIsomorphic(string s, string t) {
    if (s.length() != t.length()) return false;

    unordered_map<char, char> mapST, mapTS;

    for (int i = 0; i < s.length(); i++) {
        char c1 = s[i], c2 = t[i];

        if (mapST.count(c1) && mapST[c1] != c2)
            return false;
        if (mapTS.count(c2) && mapTS[c2] != c1)
            return false;

        mapST[c1] = c2;
        mapTS[c2] = c1;
    }

    return true;
}

int main() {
    cout << "Is 'egg' and 'add' isomorphic? " << (isIsomorphic("egg", "add") ? "Yes" : "No") << endl;
    cout << "Is 'foo' and 'bar' isomorphic? " << (isIsomorphic("foo", "bar") ? "Yes" : "No") << endl;
    cout << "Is 'paper' and 'title' isomorphic? " << (isIsomorphic("paper", "title") ? "Yes" : "No") << endl;
    return 0;
}
