package dataStructure.basic.sort;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber {

    public static void main(String[] args) {
        int numbers [] = {6, 10, 2};
        int numbers2 [] = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers2));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        // int to String -> sort >
        String [] numberString = new String[numbers.length];

        StringBuilder sb = new StringBuilder();

        int val = 0;
        // 값 초기화
        for (int i=0 ; i<numbers.length ; i++) {
            numberString[i] = numbers[i] + "";
            val += numbers[i];
        }
        Arrays.sort(numberString, new Comparator<String>() {
            @Override // 오름차 순
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        for (String s : numberString) {
            sb.append(s);
        }

        return val == 0 ? "0" : sb.toString();
    }
}
