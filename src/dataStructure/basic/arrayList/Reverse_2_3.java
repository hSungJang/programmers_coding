package dataStructure.basic.arrayList;

import java.util.Arrays;

public class Reverse_2_3 {
//
//    public static void main(String[] args) {
//        /**
//         * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//         * n은 10,000,000,000이하인 자연수입니다.
//         */
//        long arr = 1000000000;
//        System.out.println(Arrays.toString(solution(arr)));
//    }


    public static int[] solution(long n) {
        int[] answer = {};
        String reverse = String.valueOf(n);
        int size = reverse.length();
        int result [] = new int[size];
        for (int i = size-1 ; i >= 0 ; i--) {
            result[size - i - 1 ] = reverse.charAt(i) - 48;
        }

        return result;
    }
}
