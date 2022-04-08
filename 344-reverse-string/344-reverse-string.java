class Solution {
    public void reverseString(char[] s) {
        helper(0, s);
    }
    
    private void helper(int index, char[] s) {
        if (index >= s.length/2) {
            return;
        }

        char t = s[s.length - index - 1];
        s[s.length - index - 1] = s[index];
        s[index] = t;
        
        helper(index + 1, s);
    }
}