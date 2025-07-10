class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        boolean[] row = new boolean[mat.length];
        boolean[] col = new boolean[mat[0].length];
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(row[i] || col[j])
                    mat[i][j] = 0;
            }
        }
    }
}
