class Solution {
    public long sumAndMultiply(int n) {
        String num = String.valueOf(n);
        int x=0;
        long sum = 0;
        int l = 0;
        for(int i =num.length()-1; i>=0; i--){
            if((num.charAt(i))-'0' != 0){
                x += ((num.charAt(i))-'0') * Math.pow(10,l);
                l++;
            }
        }
        long temp = x;
        while(temp != 0){
            sum += temp%10;
            temp /= 10;
        }
        return x*sum;
    }
}