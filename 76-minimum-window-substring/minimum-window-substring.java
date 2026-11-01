class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
            return "";
        int missing = t.length();
        int[] freq = new int[128];
        for(char c: t.toCharArray())
            freq[c]++;
        int start = 0, min = Integer.MAX_VALUE, minSt = 0;
        for(int end = 0; end<s.length(); end++){
            if(freq[s.charAt(end)]-- > 0)
                missing--;
            while(missing == 0){
                if(end-start+1 < min){
                    min = end-start+1;
                    minSt = start;
                }
                if(++freq[s.charAt(start)] > 0)
                    missing++;
                start++;
            }
        }
        if(min == Integer.MAX_VALUE)
            return "";
        return s.substring(minSt, minSt + min);
    }
}