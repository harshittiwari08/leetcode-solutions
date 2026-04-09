class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int a[][] = new int[m][n];
        int s= original.length;
        if(s==(m*n)){
            int x=0;
            while(x<s){
             for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = original[x];
                x++;
            }
        }
            return a;
        }
        }
       return new int[0][];
    }
}