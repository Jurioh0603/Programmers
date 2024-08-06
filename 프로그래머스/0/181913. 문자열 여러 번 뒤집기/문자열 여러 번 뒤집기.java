class Solution {
    public String solution(String my_string, int[][] queries) {
        // 주어진 쿼리들에 대해 순회합니다.
        for (int[] query : queries) {
            int s = query[0]; // 시작 인덱스
            int e = query[1]; // 끝 인덱스

            // 문자열의 앞부분을 자릅니다.
            String front = my_string.substring(0, s);

            // 뒤집을 부분 문자열을 생성합니다.
            StringBuilder reverseStr = new StringBuilder();
            for (int i = e; i >= s; i--) {
                reverseStr.append(my_string.charAt(i));
            }

            // 문자열의 뒷부분을 자릅니다.
            String back = my_string.substring(e + 1);

            // 새로운 문자열을 생성합니다.
            my_string = front + reverseStr.toString() + back;
        }

        // 최종 결과 문자열을 반환합니다.
        return my_string;
    }
}