class Solution {
    public double myPow(double x, int n) {
        long N =n;
        if(N == 0)
            return 1;
        if(N<0){
            N*=-1;
            x= 1/x;
        }
        double res = calc(x,N/2);
        if(N % 2 == 0)
            return res*res;
        else
            return res*res*x;
    }
    public static double calc(double x, long n){
        return Math.pow(x,n);
    }
}