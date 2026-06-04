class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minLand = Integer.MAX_VALUE;
        int minWater = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        int flag = 0;
        for(int i = 0; i< landStartTime.length; i++){
            int time = landStartTime[i] + landDuration[i];
            minLand = Math.min(minLand, time);
        }
        for(int i = 0; i< waterStartTime.length; i++){
            int time = waterStartTime[i] + waterDuration[i];
            minWater = Math.min(minWater, time);
            flag = Math.max(waterStartTime[i], minLand) + waterDuration[i];
            res = Math.min(res, flag);
        } 
        for(int i = 0; i< waterStartTime.length; i++){
            int time = waterStartTime[i] + waterDuration[i];
            minWater = Math.min(minWater, time);
        }
        for(int i = 0; i< landStartTime.length; i++){
            int time = landStartTime[i] + landDuration[i];
            minLand = Math.min(minLand, time);
            flag = Math.max(landStartTime[i], minWater) + landDuration[i];
            res = Math.min(res, flag);
        } 
        return res;
    }
}