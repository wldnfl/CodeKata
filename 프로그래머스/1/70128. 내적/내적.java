class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i]; // a와 b 같은 인덱스끼리 곱해서 answer에 더해줌
        }
        return answer;
    }
}
