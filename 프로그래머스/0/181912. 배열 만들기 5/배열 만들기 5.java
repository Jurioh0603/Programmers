import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for(String intStr : intStrs) {
            // 문자열을 잘라 강제형변환한다.
            int subInt = Integer.parseInt(intStr.substring(s, s+l));
            // k보다 크면 answer 리스트에 넣는다.
            if(subInt > k) {
                answer.add(subInt);
            }
        }
        return answer;
    }
}