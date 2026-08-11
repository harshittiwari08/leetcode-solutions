class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int max = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(i < players.length && j< trainers.length){
            if(players[i] <= trainers[j]){
                max+=1;
                i++;
                j++;
            }
            else
                j++;
        }
        return max;
    }
}