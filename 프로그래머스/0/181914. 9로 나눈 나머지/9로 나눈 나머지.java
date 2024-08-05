import java.math.BigInteger;

class Solution {
    public BigInteger solution(String number) {
        BigInteger bicNum = new BigInteger(number);
        BigInteger divNum = new BigInteger("9");
        BigInteger result = bicNum.remainder(divNum);
        return result;
    }
}