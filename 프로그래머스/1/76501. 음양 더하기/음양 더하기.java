class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) { // true일 결우
                answer += absolutes[i];
            } else { // false일 경우
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}