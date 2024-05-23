import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] words = s.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(words);

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}