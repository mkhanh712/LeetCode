class Solution {
    /*
       [x x x],
       [x x x]
    */
    public int numSpecial(int[][] mat) {
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if(mat[i][j] == 1){
                    row[i]++; // đếm xem hàng đó (i) có bao nhiêu số 1
                    col[j]++; // đếm xem cột đó có bao nhiêu số 1
                }
            }
        }
        int count = 0;
        for(int i = 0; i < row.length; i++){
            for(int j = 0; j < col.length; j++){
                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){ // cột đó hàng đó chỉ có 1 số 1 (đếm ở for trên)
                    count++;
                }
            }
        } 
        return count;
    }
}