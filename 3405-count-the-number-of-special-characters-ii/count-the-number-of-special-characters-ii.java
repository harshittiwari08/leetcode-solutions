class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> lower = new HashMap<>();
        HashMap<Character, Integer> upper = new HashMap<>();
        int count = 0;
        for(int i=0; i< word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower.put(ch, i);
            }
            if(Character.isUpperCase(ch)){
                upper.putIfAbsent(Character.toLowerCase(ch), i);
            }
        }
        for(char ch : lower.keySet()){
            if(upper.containsKey(ch) && lower.get(ch) < upper.get(ch))
                count+=1;
        }
        return count;
    }
}