class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1; //곱 (0을 곱하면 안됨)
        int pl = 0;    //합
        double po = 0.0; //제곱
        for (int i = 0; i < num_list.length; i++) {
            multi = num_list[i]*multi; //원소의 곱
            pl += num_list[i];    //원소의 합
        }
        po = Math.pow(pl, 2); //합의 제곱
        return answer = (multi < po) ? 1 : 0;
    }
}