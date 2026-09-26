class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        int n = grid.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            int[] arr = new int[n];
            for(int j = 0; j<n; j++)
                arr[j] = grid[i][j];
            String str = Arrays.toString(arr);
            map.put(str, map.getOrDefault(str,0)+1);
        }
        for(int i = 0; i<n; i++){
            int[] arr = new int[n];
            for(int j = 0; j<n; j++)
                arr[j] = grid[j][i];
            String str = Arrays.toString(arr);
            if(map.containsKey(str))
                count += map.get(str);
        }
        return count;
    }
}