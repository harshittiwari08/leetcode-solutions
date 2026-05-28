class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        int count = 0;
        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch))
                upper.add(Character.toLowerCase(ch));
        }
        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch))
                lower.add(ch);
        }
        for(char ch: lower){
            if(upper.contains(ch))
                count+=1;
        }
        return count;
    }
}