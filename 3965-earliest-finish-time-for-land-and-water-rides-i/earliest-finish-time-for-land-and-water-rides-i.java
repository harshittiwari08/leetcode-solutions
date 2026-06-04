class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i< landStartTime.length; i++){
            int endTime =  landStartTime[i] + landDuration[i];
            for(int j = 0; j< waterStartTime.length; j++){
                int flag = endTime;
                flag = Math.max(endTime, waterStartTime[j]) + waterDuration[j];
                res = Math.min(res, flag);
            }
            
        }
        for(int i = 0; i< waterStartTime.length; i++){
            int endTime =  waterStartTime[i] + waterDuration[i];
            for(int j = 0; j< landStartTime.length; j++){
                int flag = endTime;
                flag = Math.max(endTime, landStartTime[j]) + landDuration[j];
                res = Math.min(res, flag);
            }
            // res = Math.min(res, endTime);
        }
        return res;
    }
}