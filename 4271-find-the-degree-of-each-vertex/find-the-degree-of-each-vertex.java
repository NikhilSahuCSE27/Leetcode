class Solution {
    public int[] findDegrees(int[][] matrix) {
        int x=0;
        int arr[]=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}