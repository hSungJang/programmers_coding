package dataStructure.basic.lvl2;

import java.util.LinkedList;
import java.util.List;

public class Decimal {

//    public static void main(String[] args) {
//
//        String number = "123";
//        System.out.println(solution(number));
//    }

    public static int solution(String numbers) {
        int answer = 0;

        char [] nums = numbers.toCharArray();
        // 모든 조합을 찾아 수를 만들고 소수를 검색

        // 숫자 만들기
        List<Integer> list = new LinkedList<>();
        // 1234
        // 1, 12, 13, 14, 123, 132,
        // 2, 21, 23, 24, 213, 214, 231, 234, 243, 241,
        for (int i=0 ; i<nums.length ; i++) {


        }


        return answer;
    }

    public int makeNumber(String val) {
        int result = 0;

        return 0;
    }


    public boolean checkDecimal(int val) {
        for (int i=2 ; i<val/2 ; i++) {
            if ( (val % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
