class Solution {
    public int solution(int n, String control) {
        String[] controlArr = control.split("");
        for(int i=0; i<controlArr.length; i++) {
        	if(controlArr[i].equals("w")) {
        		n += 1;
        	} else if(controlArr[i].equals("s")) {
        		n -= 1;
        	} else if(controlArr[i].equals("d")) {
        		n += 10;
        	} else if(controlArr[i].equals("a")) {
        		n -= 10;
        	}
        	
        }
        return n;
    }
}