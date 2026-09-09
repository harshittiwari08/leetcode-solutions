class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1, i = 1;
        while(i < chars.length){
            if(chars[i] == chars[i-1]){
                count++;
            }
            else{
                sb.append(chars[i-1]);
                if(count >1)
                    sb.append(count);
                count = 1;
            }
            i++;
        }
        sb.append(chars[i - 1]);
        if(count > 1)
            sb.append(count);
        
        for(int j =0; j<sb.length(); j++)
            chars[j] = sb.charAt(j);

        return sb.length();
    }
}