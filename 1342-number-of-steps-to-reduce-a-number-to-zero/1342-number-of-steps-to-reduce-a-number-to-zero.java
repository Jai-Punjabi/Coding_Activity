class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            // If the number is even, divide by 2; if odd, subtract 1.
            num = (num % 2 == 0) ? num / 2 : num - 1;
            steps++;
        }
        
        return steps;
    }
}
