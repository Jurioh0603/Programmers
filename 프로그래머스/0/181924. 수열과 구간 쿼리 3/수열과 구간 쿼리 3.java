class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int iValue = 0;
        for(int i=0; i<queries.length; i++) {
        	iValue = arr[queries[i][0]];
        	arr[queries[i][0]] = arr[queries[i][1]];
        	arr[queries[i][1]] = iValue;
        }
        for(int i=0; i<arr.length; i++) {
        	answer = arr;
        }
        return answer;
    }
}