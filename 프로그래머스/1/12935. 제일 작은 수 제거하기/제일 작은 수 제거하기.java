class Solution {
    public int[] solution(int[] arr) {
        // 배열 길이가 1인 경우 -1로 반환하고 끝
        if (arr.length == 1) {
            int[] answer_one = {-1};
            return answer_one;
        }

        // 가장 작은 수 하나 빼야하니까 총 배열 길이에서 -1
        int[] answer = new int[arr.length - 1];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        int answer_num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            } else {
                answer[answer_num++] = arr[i];
            }
        }
        return answer;
    }
}