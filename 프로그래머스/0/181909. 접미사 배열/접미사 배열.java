import java.util.*;

class Solution {
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        //for문으로 돌리기
        for(int i=0; i<my_string.length(); i++){
            String word = my_string.substring(i,my_string.length());
            answer.add(word);
        }
        //사전 순으로 결과 출력과 출력
        answer.sort(null);
        return answer;
    }
}