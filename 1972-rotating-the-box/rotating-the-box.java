class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        for(int i =0; i< m; i++){
            int e = n-1;
            for(int j = n-1; j>-1; j--){
                if(box[i][j] == '*')
                    e = j-1;
                else if(box[i][j] == '#'){
                    char temp = box[i][e];
                    box[i][e] = '#';
                    box[i][j] = temp;
                    e--;
                }
            }
        }
        char arr[][] = new char[n][m];
        for(int i =0; i< m; i++){
            for(int j = 0; j<n; j++)
                arr[j][m-i-1] = box[i][j];  
        }
        return arr;
    }
}