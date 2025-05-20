Given two integers left and right, return the count of numbers in the inclusive range [left, right] having a prime number of set bits in their binary representation.

Recall that the number of set bits an integer has is the number of 1's present when written in binary.

For example, 21 written in binary is 10101, which has 3 set bits.
ans:
class Solution {
    public int countPrimeSetBits(int left, int right) {
         int count_prime_setnum = 0;
        for(int i = left; i <= right; i++){
            String bin = Integer.toBinaryString(i);
             int count = 0;
            for(int j = 0; j < bin.length(); j++){
                char ch = bin.charAt(j);
                if(ch == '1'){
                    count++;
                }
            }
            if(isprime(count)){
                count_prime_setnum++;  
            }
        }
        return count_prime_setnum;
    }
    public boolean isprime(int count){
        if(count < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(count); i++){
            if(count % i == 0){
                return false;
            }
        }
        return true;
    }
}