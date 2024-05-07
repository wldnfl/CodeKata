class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // n의 개수로 배열 크기 설정
        long num = x;
        for (int i = 0; i < answer.length; i ++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}