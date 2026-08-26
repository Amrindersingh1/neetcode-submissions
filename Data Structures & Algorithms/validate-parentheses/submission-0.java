class Solution {
    public boolean isValid(String s) {
       Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if(c == ')' || c == '}' || c == ']' ) {
                if (stack.isEmpty()) return false;
                else if(c == ')' && stack.peek() == '(') stack.pop();
                else if(c == ']' && stack.peek() == '[') stack.pop();
                else if(c == '}' && stack.peek() == '{') stack.pop();
                else return false;

            }
            else stack.push(c);
        }
        return stack.isEmpty(); 
    }
}
