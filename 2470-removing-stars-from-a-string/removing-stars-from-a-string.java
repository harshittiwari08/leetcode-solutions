class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                if(st.empty())
                    continue;
                st.pop();
            }
            else
                st.push(s.charAt(i));
        }
        String res = "";
        while(!st.empty()){
            res = st.peek()+res;
            st.pop();
        }
        return res;
    }
}