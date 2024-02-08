class Solution {
    public String solution(String[] arr) {
        String answer = "";
		answer = Arrays.toString(arr);
		answer = answer.replaceAll("[^a-zA-Z]", "");
        return answer;
    }
}