class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(!map.containsKey(num))
                map.put(num,1);
            else
                map.replace(num,map.get(num)+1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        if(set.size() == map.size())
            return true;
        return false;
    }
}