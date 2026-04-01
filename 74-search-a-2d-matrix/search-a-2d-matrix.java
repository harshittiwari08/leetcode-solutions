class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        int end = row*column-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            int r = mid/column;
            int c = mid%column;
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] > target)
                end = mid-1;
            
            else
                start = mid+1;
        }
        return false;
    }
}