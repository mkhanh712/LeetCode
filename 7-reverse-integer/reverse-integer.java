//Integer.MAX_VALUE = 2147483647 
//Integer.MIN_VALUE = -2147483648
class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while(x != 0){
            int digit = x % 10; //lấy số cuối
            x = x / 10; //bỏ số cuối

            //phải chia 10 vì reversed*10 sẽ tràn
            if (reversed < Integer.MIN_VALUE /10 || reversed > Integer.MAX_VALUE / 10){ 
                return 0;
            }
            reversed = reversed * 10 + digit; // 3 -> 3*10 30+2 -> 32*10 320+1
        }
        return reversed;
    }
}