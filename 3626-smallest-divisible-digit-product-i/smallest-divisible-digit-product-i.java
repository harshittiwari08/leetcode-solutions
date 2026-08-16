class Solution {
    public int smallestNumber(int n, int t) {
        if(n == t)
            return n;
        int sum = -1;
        for(int i = n; ; i++){
            sum = calcSum(i);
            if(sum % t == 0){
                return i;
            }
        }
    }
    public static int calcSum(int n){
        int sum = 1;
        while(n!=0){
            int d = n%10;
            sum*=d;
            n/=10;
        }
        return sum;
    }
}