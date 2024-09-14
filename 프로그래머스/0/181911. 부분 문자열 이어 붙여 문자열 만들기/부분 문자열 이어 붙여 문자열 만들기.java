class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            // parts[i]의 첫 번째 값은 시작 인덱스, 두 번째 값은 끝 인덱스 (exclusive)
            String temp = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            answer.append(temp);
        }

        return answer.toString();
    }
}