class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0; // 약수 개수 세기 위한 변수

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++; // j가 i의 약수면 cnt 증가
                }
            }
            if (cnt % 2 == 0)
                answer += i; // 짝수면 i를 answer에 더함
            else
                answer -= i; // 홀수면 뺌
        }
        return answer;
    }
}
