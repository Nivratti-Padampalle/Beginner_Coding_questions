Q1. Find The Least Frequent Digit
Easy
3 pt.
Given an integer n, find the digit that occurs least frequently in its decimal representation. If multiple digits have the same frequency, choose the smallest digit.

Return the chosen digit as an integer.

The frequency of a digit x is the number of times it appears in the decimal representation of n.
 

Example 1:

Input: n = 1553322

Output: 1

Explanation:

The least frequent digit in n is 1, which appears only once. All other digits appear twice.

Example 2:

Input: n = 723344511

Output: 2

Explanation:

The least frequent digits in n are 7, 2, and 5; each appears only once
ans:
class Solution {
    public int getLeastFrequentDigit(int n) {
        //"1553322"
        /*int min = Integer.MAX_VALUE;
        int prev = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((ch - '0') == (str.charAt(j) - '0')) {
                    count++;
                }
            }
            if (count < min || (count == min &&  (ch - '0') < prev)) {
        
                min = count;
                prev = (ch - '0');
            }
        }
        return prev;
        */
        String str = Integer.toString(n);
        char[] chararr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chararr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int minFreq = Integer.MAX_VALUE;
        int result = 10; // Larger than any digit

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int digit = entry.getKey() - '0'; // Convert char to int
            int freq = entry.getValue();

            if (freq < minFreq || (freq == minFreq && digit < result)) {
                minFreq = freq;
                result = digit;
            }
        }
        return result;
    }
}