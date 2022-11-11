#include <unordered_map>
#include <string>
#include <sstream>
using namespace std;
class Solution
{
public:
    vector<string> split(string s, char delimiter)
    {
        // outputTokens
        vector<string> tokens; // Each token will store here
        string token;
        // pass actual string to stringstream
        stringstream ss(s);
        while (getline(ss, token, delimiter))
        {
            // keep adding token till getline returning the token or not NULL
            tokens.push_back(token);
        }
        // returned outputTokens vector
        return tokens;
    }
    bool wordPattern(string pattern, string s)
    {
        unordered_map<char, string> map_1;
        unordered_map<string, char> map_2;

        vector<string> result = split(string, ",");

        // Check both pattern and string for their size
        if (pattern.size() != s.size())
        {
            return false;
        }

        for (int i = 0; i < pattern.size(); i++)
        {
            // We check whether the character is already present in first the map or not
            char s1 = pattern[i];
            string s2 = result[i];
            if (map_1[s1] != 0)
            {
                if (map_1[s1] != s2)
                {
                    return false
                }
            }

            else
            {
                map_1[s1] = s2;
            }
            // Checking the second hash map to be sure
            if (map_2[s2] != 0)
            {
                if (map_2[s2] != s1)
                {
                    return false
                }
            }

            else
            {
                map_2[s2] = s1;
            }
        }

        return true;
    }
};