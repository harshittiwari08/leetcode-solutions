class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        int res = 0;
        for(int num: arr1){
            while(num != 0){
                if(set.contains(num))
                    break;
                set.add(num);
                num /= 10;
            }
        }
        for(int num : arr2){
            while(num != 0){
                if(set.contains(num)){
                    ans = Math.max(ans, digits(num));
                    break;
                }
                num /= 10;
            }
        }
        if(ans != 0)
            return ans;
        return 0;
    }
    public int digits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n/10;
        }
        return count;
    }
}