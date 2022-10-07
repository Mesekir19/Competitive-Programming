class NumMatrix {
    int[][] arr;
    int sum;
    public NumMatrix(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length==0)return;
        int row=matrix.length;
        int col=matrix[0].length;
        arr=new int[row+1][col+1];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i+1][j+1]=matrix[i][j]+arr[i][j+1]+arr[i+1][j]-arr[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=arr[row2+1][col2+1]-arr[row2+1][col1]-arr[row1][col2+1]+arr[row1][col1];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
