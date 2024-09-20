class Solution {
    public String solution(String my_string, int n) {
        // 전체길이 - n + 1 부터 끝까지
        int startIndex = my_string.length() - n;
        int endIndex = my_string.length();
        return my_string.substring(startIndex, endIndex);
    }
}