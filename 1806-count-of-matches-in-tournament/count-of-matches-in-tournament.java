class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while(n>0){
            if(n%2==0){
                n /= 2;
                matches += n;
            }
            else{
                n--;
                matches++;
                n /= 2;
                matches += n;
            }
        }
        matches--;
        return matches;
    }
}