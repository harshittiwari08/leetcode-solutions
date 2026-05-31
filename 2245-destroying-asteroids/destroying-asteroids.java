class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long cm=mass;
        Arrays.sort(asteroids);
        for(int i =0; i< asteroids.length; i++){
            if(cm<asteroids[i])
                return false;
            cm+=asteroids[i];
        }
        return true;
    }
}