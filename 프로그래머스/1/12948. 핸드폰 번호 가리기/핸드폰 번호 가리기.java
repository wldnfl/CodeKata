class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] numbers = phone_number.split("");
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            if (i < len - 4) {
                answer += "*";
            } else {
                answer += numbers[i];
            }
        }
        return answer;
    }
}