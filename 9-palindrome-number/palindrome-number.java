class Solution {
    public boolean isPalindrome(int x) {
        if (x % 10 == 0 && x != 0){
            return false;
        }
        int reversed = 0;
        while(x > reversed){
            int digit = x % 10;
            reversed = reversed * 10 + digit; //121, rev= 1 x =12, rev=12 x=1
            x = x / 10;
        }
        if (x == reversed / 10 || x == reversed || x == 0){
            return true;
        }else{
            return false;
        }


    }
}