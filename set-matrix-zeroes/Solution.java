class Solution{
    public void setZeroes(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] rowZero = new int[rows];
        int[] colZero = new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            if(matrix[i][j]==0){
            rowZero[i]=1;
            colZero[j]=1;
            }}}
            for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rowZero[i]==1||colZero[j]==1){
                    matrix[i][j]=0;
                }}}}}