class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0)
            return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> res = new ArrayList<>();
        int[] newInt = intervals[0];
        res.add(newInt);
        for(int[] interval : intervals){
            if(interval[0] <= newInt[1])
                newInt[1] = Math.max(interval[1], newInt[1]);
            else{
                newInt = interval;
                res.add(newInt);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}