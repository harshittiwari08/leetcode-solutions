class Solution {
    public int totalWaviness(int num1, int num2) {
        int temp = num2;
        int count = 0;
        int ans = 0;
        while(temp != 0){
            count++;
            temp/=10;
        }
        if(count <= 1)
            return 0;
        for(int i = num1; i<=num2; i++){
            char[] c = String.valueOf(i).toCharArray();
            for(int j = 1; j< c.length-1; j++){
                if(c[j] < c[j+1] && c[j] < c[j-1] || c[j] > c[j+1] && c[j] > c[j-1])
                    ans++;
            }
        }
        return ans;
    }
}