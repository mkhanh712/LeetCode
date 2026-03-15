class Solution {
    public int bitwiseComplement(int n) {
        //highestOneBit lấy bit 1 đầu tiên từ bên trái và chuyển còn lại thành 0, vd 101 -> 100
        // << 1 là dịch trái 1 bit -> 100 -> 1000
        // 1000 - 1(0001) = 0111(0 trừ 1 ko đc nên mượn bit bên trái tới khi gặp 1 nên các bit giữa thành 1) = 111 (0 ko tính)
        // ^ là phép XOR, 0 ^ 0 = 1, 1 ^ 0 hay 0 ^ 1 = 1, 1 ^ 1 = 0
        // các phép xor, << và - 1 đều được thực hiện bằng bit (phía bên trong) nhưng return thì nó tự chuyển bit sau calc thành int 
        // StringBuilder temp = new StringBuilder();
        // String binary = Integer.toBinaryString(n);
        // for(int i = 0; i < binary.length(); i++){
        //     temp.append(binary.charAt(i) == '0' ? '1' : '0');
        // }
        // int tempInt;
        // return tempInt = Integer.parseInt(temp.toString(), 2);

        return n == 0 ? 1 : n ^ ((Integer.highestOneBit(n) << 1) -1);
    }
}