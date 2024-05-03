import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10; // 10으로 나눈 나머지 더하기
            n /= 10; // n을 10으로 나누면서 한 자리씩 소거
        }

        return answer;
    }
}
