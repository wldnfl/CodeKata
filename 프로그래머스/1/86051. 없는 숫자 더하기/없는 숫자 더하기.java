class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int n : numbers) {
            answer -= n;
        }
        return answer;
    }
}

// 0~9의 합인 45에서 있는 숫자들을 빼주면 된다
