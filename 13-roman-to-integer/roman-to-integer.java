class Solution {
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++){ //trái -> phải
            int curr = value(s.charAt(i));
            if(i + 1 < s.length() && curr < value(s.charAt(i+1))){ //số nhất luôn ở trái, vd MCM thì M xong tới C thì ko thể M tiếp nên nó là CM
                total -= curr; // MCM, C < M nên -C sau đó +M 
            } else{
                total += curr; 
            }
        }
        return total;
    }

    private int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}