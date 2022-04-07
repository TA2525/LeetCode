class Solution {
    public int reverse(int x) {

        int signMultiplier = 1;
        if (x < 0) {
            signMultiplier = -1;
            x = signMultiplier * x;
        }
        
        int reverse = 0;
        
        while (x > 0) {
            if (reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) {
                return 0;
            }
            reverse = (reverse*10) + (x%10);
            x = x/10;
        }

        return signMultiplier * reverse;
    }
}