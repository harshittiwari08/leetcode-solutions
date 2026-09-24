class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] num = new int[2001];
        for(int i = 0; i<arr.length; i++)
            num[arr[i]+1000] += 1; 
        
        Arrays.sort(num);
        for(int i = 1; i<num.length; i++){
            if(num[i] != 0 && num[i-1]==num[i])
                return false;
        }
        return true;
    }
}