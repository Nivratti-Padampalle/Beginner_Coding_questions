You are given a string s consisting of lowercase English letters ('a' to 'z').

Your task is to:

Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
Find the consonant (all other letters excluding vowels) with the maximum frequency.
Return the sum of the two frequencies.

Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

The frequency of a letter x is the number of times it occurs in the string.
 

Example 1:

Input: s = "successes"

Output: 6

Explanation:

The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
The output is 2 + 4 = 6.
ans:
class Solution {
    public int maxFreqSum(String s) {
        String str = s.toLowerCase();
        int prev = 0;  
        int prev2 = 0; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    char ch2 = str.charAt(j);
                    if (ch == ch2) {
                        count++;
                    }
                }
                if (count > prev) {
                    prev = count;
                }
            } else {
                int count2 = 0;
                for (int k = 0; k < str.length(); k++) {
                    char ch3 = str.charAt(k);
                    if (ch3 == ch) {
                        count2++;
                    }
                }
                if (count2 > prev2) {
                    prev2 = count2; 
                }
            }
        }
        return prev + prev2;
    }
}
