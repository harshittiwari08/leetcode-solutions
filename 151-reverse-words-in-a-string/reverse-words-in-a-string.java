class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = str.length-1; i>=0;i--){
            if(str[i].length() > 0){
                res.append(str[i]);
                res.append(" ");
            }
        }

        return res.substring(0, res.length()-1).toString();
    }
}