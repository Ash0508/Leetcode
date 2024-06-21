import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger ob1=new BigInteger(num1);
        BigInteger ob2=new BigInteger(num2);
        BigInteger mul=ob1.multiply(ob2);
        return mul.toString();
    }
}