import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length]; // vì comparator (a,b) work trên object, dùng Integer[], ko dùng int[] được
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i]; //copy mảng arr cho mảng temp
        }
        Arrays.sort(temp, (a, b) ->{
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            if(bitA != bitB){
                return bitA - bitB;
            }
            return a - b;
        });
        for(int i = 0; i < temp.length; i++){
            arr[i] = temp[i]; //copy lại mảng đã sắp xếp cho arr
        }
        return arr;
    }
}