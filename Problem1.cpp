// Approach:
// Use a hash map with the sorted word as the key to group all anagrams together.
// Sorting helps ensure that all anagrams share the same signature.
// Finally, return the grouped anagram lists from the map.

#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;

vector<vector<string>> groupAnagrams(vector<string>& strs) {
    unordered_map<string, vector<string>> map;
    for (string s : strs) {
        string sortedStr = s;
        sort(sortedStr.begin(), sortedStr.end());
        map[sortedStr].push_back(s);
    }

    vector<vector<string>> result;
    for (auto& pair : map)
        result.push_back(pair.second);
    return result;
}

int main() {
    vector<string> input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>> result = groupAnagrams(input);
    cout << "Grouped Anagrams:\n";
    for (auto group : result) {
        cout << "[ ";
        for (string word : group) {
            cout << word << " ";
        }
        cout << "]\n";
    }
    return 0;
}
