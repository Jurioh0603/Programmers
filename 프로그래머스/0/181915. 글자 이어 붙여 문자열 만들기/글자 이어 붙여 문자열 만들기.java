
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        List<String> strArr = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            strArr.add(my_string.substring(i,i+1));
        }
        for(int j=0; j<index_list.length; j++) {
        	int index = index_list[j];
            answer += strArr.get(index);
        }
        return answer;
    }
}