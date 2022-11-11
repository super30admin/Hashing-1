#include <unordered_map>
using namespace std;
#include <sstream>
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
    bool isIsomorphic(string s, string t)
    {

        // Implementing solution using two hash maps
        std::unordered_map<char, char> s_map;
        std::unordered_map<char, char> t_map;

        if (s.size() != t.size())
        {
            return false;
        }

        for (int i = 0; i <= s.size(); i++)
        {
            char s1 = s[i];
            char t1 = t[i];

            // Check if key is present in the hash map
            if (s_map[s1] != 0)
            {
                if (s_map[s1] != t1)
                {
                    return false;
                }
            }
            else
            {
                s_map[s1] = t1;
            }

            if (t_map[t1] != 0)
            {
                if (t_map[t1] != s1)
                {
                    return false;
                }
            }
            else
            {
                t_map[t1] = s1;
            }

            //
        }

        return true;
    }
};