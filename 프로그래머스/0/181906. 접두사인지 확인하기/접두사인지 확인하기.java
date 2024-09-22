class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            String word = my_string.substring(0, i);
            if(!word.equals(is_prefix)){
                continue;
            } else {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}