class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder compBinary = new StringBuilder();
        for(int i = 0; i < binary.length(); i++){
            compBinary.append(binary.charAt(i) == '0' ? '1' : '0');
        }
        int compInt = Integer.parseInt(compBinary.toString(), 2);
        return compInt;
    }
}