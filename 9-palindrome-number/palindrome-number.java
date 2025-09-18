class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reversed = 0;
        while(x > reversed){
            int digit = x % 10; // x = 121 % 10 = 1
            reversed = reversed * 10 + digit; // reversed = 0 * 10 + 1 = 1
            x = x / 10; // x = 121 / 10 = 12
            //secondLoop: x = 12 % 10 = 2; reversed = 1 * 10 + 2 = 12; x = 12 / 10 = 1 -> outloop x>reversed
        }

        if (x == reversed / 10 || x == reversed){
            return true;
        }

        return false;
    }
}