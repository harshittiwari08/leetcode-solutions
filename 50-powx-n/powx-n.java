class Solution {
    public double myPow(double x, int n) {
        long N =n;
        if(N == 0)
            return 1;
        if(N<0){
            N*=-1;
            x= 1/x;
        }
        boolean status = true;
        return x*calc(x,N-1);
    }
    public static double calc(double x, long n){
        return Math.pow(x,n);
    }
}