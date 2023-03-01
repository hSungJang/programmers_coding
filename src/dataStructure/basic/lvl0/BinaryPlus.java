package dataStructure.basic.lvl0;

import java.math.BigInteger;

public class BinaryPlus {

    public static void main(String[] args) {

        String bin1 = "10";
        String bin2 = "11";
        System.out.println(solution(bin1, bin2));
    }

    public static String solution(String bin1, String bin2) {
        String answer = "";
        BigInteger val1 = new BigInteger(bin1, 2);
        BigInteger val2 = new BigInteger(bin2, 2);

        BigInteger sum = val1.add(val2);
        answer = sum.toString(2);
        return answer;
    }
}
