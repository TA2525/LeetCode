class Solution {
    public void reverseString(char[] s) {
        helper(0, s);
    }
    
    private void helper(int index, char[] s) {
        if (index >= s.length) {
            return;
        }
        helper(index + 1, s);
        if (index >= s.length/2) {
            char t = s[s.length - index - 1];
            s[s.length - index - 1] = s[index];
            s[index] = t;
        }
    }
}