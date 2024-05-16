import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
                cnt += 1;
            }
        }
        if (cnt == 0) {
            list.add(-1);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);

        return answer;
    }
}