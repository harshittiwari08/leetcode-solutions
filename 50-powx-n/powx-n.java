class Solution {
    public double calc(double x, long n){
        long N =n;
        if(N == 0)
            return 1;
        if(N == 1)
            return x;
        double ans = calc(x,N/2);
        if(N % 2 == 0){
            return ans*ans;
        }
        else
            return ans*ans*x;
    }
    public double myPow(double x, int n) {
        if(n<0){
            return calc(1/x, -n);
        }
        return calc(x,n);
    }
}