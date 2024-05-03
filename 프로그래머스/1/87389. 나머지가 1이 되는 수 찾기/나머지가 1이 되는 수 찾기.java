class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) { // n 최솟값 3이니까 2부터
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}