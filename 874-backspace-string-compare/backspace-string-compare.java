class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    
    private String build(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            } else {
                stack.push(ch);
            }
        }
        return String.valueOf(stack);
    }
}