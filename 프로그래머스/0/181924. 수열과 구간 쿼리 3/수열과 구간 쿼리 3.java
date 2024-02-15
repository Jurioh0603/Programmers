class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int iValue = 0;
        for(int i=0; i<queries.length; i++) {
        	iValue = arr[queries[i][0]]; //임시 값 넣기
        	arr[queries[i][0]] = arr[queries[i][1]];  //값 교환
        	arr[queries[i][1]] = iValue;
        }
        for(int i=0; i<arr.length; i++) { //배열 복사
        	answer = arr;
        }
        return answer;
    }
}
