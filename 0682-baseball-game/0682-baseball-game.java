class Solution {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length];
        int top = -1;

        for(String op : operations) {
            if(op.equals("+")) {
                int score = stack[top] + stack[top-1];
                top++;
                stack[top] = score;
            }
            else if(op.equals("D")) {
                int score = stack[top] * 2;
                top++;
                stack[top] = score;
            }
            else if(op.equals("C")) {
                top--;
            }
            else {
                int score = Integer.parseInt(op);
                top++;
                stack[top] = score;
            }
        }
        int totalSum = 0;
        for(int i = 0; i<=top; i++) {
            totalSum += stack[i];
        }
        return totalSum;
    }
}