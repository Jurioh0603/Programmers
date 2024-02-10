class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        String[] codeArr = code.split("");

        for (int i = 0; i < codeArr.length; i++) {
            if (mode == 0) {
                ret += (i % 2 == 0 && code.charAt(i) != '1') ? codeArr[i] : "";
                mode = (codeArr[i].equals("1")) ? 1 : 0;
            } else if (mode == 1) {
                ret += (i % 2 == 1 && code.charAt(i) != '1') ? codeArr[i] : "";
                mode = (codeArr[i].equals("1")) ? 0 : 1;
            }
        }
        return answer = (ret.equals("")) ? "EMPTY" : ret;
    }
}