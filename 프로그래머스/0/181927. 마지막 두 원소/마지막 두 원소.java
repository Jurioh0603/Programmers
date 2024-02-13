class Solution {
    public int[] solution(int[] num_list) {
		int num = 0;
        int answerArrLength = num_list.length+1;
        int[] answer = new int[answerArrLength];
        
        if(num_list[num_list.length-1]>num_list[num_list.length-2]) {
        	num = (num_list[num_list.length-1]-num_list[num_list.length-2]);
        } else {
        	num=2*(num_list[num_list.length-1]);
        }	
        
        for(int i=0; i<answerArrLength; i++) {
        	if(i<num_list.length) {
        		answer[i] = num_list[i];
        	} else if(i == num_list.length) {
        		answer[i] = num;
        	}
        }
        return answer;
    }
}