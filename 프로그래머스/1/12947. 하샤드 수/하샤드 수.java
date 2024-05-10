class Solution {
    public boolean solution(int x) {
        // x를 각 자릿수로 분할하여 더하기
        // x를 더한 값과 나누어 떨어지면 true 아니면 false 출력
        
        int num = x;
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0 ? true : false;
    }
}