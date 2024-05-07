class Solution {
    public int[] solution(long n) {
        String arr = Long.toString(n);
        int[] answer = new int[arr.length()];
        for (int i = arr.length() - 1; i >= 0; i--) {
            answer[arr.length() - i - 1] = arr.charAt(i) - '0';
        }
        return answer;
    }
}