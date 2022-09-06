class Solution {
    public int fib(int n) {
        int c = 1;
        int first = 0;
        int second = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        while (c < n) {
            int sum = first + second;
            first = second;
            second = sum;
            c++;
        }
        return second;
    }
}