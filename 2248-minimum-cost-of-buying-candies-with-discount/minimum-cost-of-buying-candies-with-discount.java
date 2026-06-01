class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int min = 0;
        int count = 0;
        int curr = cost.length-1;
        if(cost.length == 1)
            return cost[0];
        else if(cost.length == 2 || cost.length == 3)
            return cost[cost.length-1]+cost[cost.length-2];
        while(curr != -1){
            if(count == 2){
                count = 0;
                curr--;
                continue;
            }
            min += cost[curr];
            count++;
            curr--;
        }
        return min;
    }
}