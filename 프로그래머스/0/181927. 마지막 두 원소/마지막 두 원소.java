class Solution {
    public int[] solution(int[] num_list) {
		int num = 0;
        int answerArrLength = num_list.length+1;
	//answer의 길이 num_list의 길이보다 한개 더 크게 지정
        int[] answer = new int[answerArrLength];
        //마지막 배열 -> num_list.length-1
        //뒤에서 2번째 배열 -> num_list.length-2
        if(num_list[num_list.length-1]>num_list[num_list.length-2]) {
        	num = (num_list[num_list.length-1]-num_list[num_list.length-2]);
        } else {
        	num=2*(num_list[num_list.length-1]);
        }	
        //answer에 값 넣기
        for(int i=0; i<answerArrLength; i++) {
        	if(i<num_list.length) { //== num_list.length-1(num_list의 마지막 값)
        		answer[i] = num_list[i];
        	} else if(i == num_list.length) { //== num_list보다 하나더 추가된 인덱스
        		answer[i] = num;
        	}
        }
        return answer;
    }
}
