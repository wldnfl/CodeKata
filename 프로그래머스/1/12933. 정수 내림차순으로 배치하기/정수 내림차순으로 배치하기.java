import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // String.valueOf(n) : long 타입의 숫자 문자열로 변환하는 메서드
        // split("") : 문자열 한 글자씩 잘라서 배열에 넣는 메서드 (여기서는 숫자 한 자리씩 나눔)
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list); // 배열 정렬 메서드 (오름차순)

        // 문자열 처리 클래스 (역순으로 만들기 위해 사용)
        StringBuilder sb = new StringBuilder(); 
        for (String str : list) sb.append(str);

        // StringBuilder로 만든 문자열 역순으로 하고, 다시 숫자로 변환
        return Long.parseLong(sb.reverse().toString());
    }
}
