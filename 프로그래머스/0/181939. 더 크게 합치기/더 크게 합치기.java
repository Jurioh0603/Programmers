class Solution {
        public int solution(int a, int b) {
        int answer = 0;
        String str1 = ""+a+b;
        String str2 = ""+b+a;
        
        int ab = Integer.parseInt(str1);
        int ba = Integer.parseInt(str2);
        if(ab>=ba) {
        	answer = ab;
        } else {
        	answer = ba;
        }
        return answer;
    }
}