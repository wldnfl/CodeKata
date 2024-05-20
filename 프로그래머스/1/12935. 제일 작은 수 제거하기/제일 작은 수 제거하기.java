class Solution {
    public int[] solution(int[] arr) {
        // 배열 길이가 1인 경우 -1을 원소로 갖는 배열 반환
        if (arr.length == 1) {
            int[] answer_one = {-1};
            return answer_one;
        }

        // 가장 작은 수 하나 빼야하니까 총 배열 길이에서 -1
        int[] answer = new int[arr.length - 1];

        int min = Integer.MAX_VALUE; // min 변수 초기화
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        // 최소값을 제외한 값들로 새로운 배열 채우기
        int answer_num = 0; // 새로운 배열 answer의 현재 인덱스 가리킴
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue; // 최소값 동일 원소 건너뛰기
            } else { // 최소값 아닌 경우
                answer[answer_num++] = arr[i];
            }
        }
        return answer;
    }
}
