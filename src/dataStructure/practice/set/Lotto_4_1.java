package dataStructure.practice.set;

import java.util.HashSet;
import java.util.Set;

public class Lotto_4_1 {

    public static void main(String[] args) {
        int [] numbers = {4, 7, 32, 43, 22, 19};
        int [] numbers1 = {3, 19, 34, 39, 39, 20};

        // normal case
        System.out.println("solution number:  " + solution(numbers));
        // duplication case
        System.out.println("solution number1:  " + solution(numbers1));
    }

    public static boolean solution(int[] lotto) {
        //1. 입력 받은 배열을 set으로 저장
        Set<Integer> element = new HashSet<>();
        for (int i=0 ; i<lotto.length ; i++) {
            element.add(lotto[i]);
        }

        //2. set의 size == 6 일 경우 true
        return element.size() == 6;
    }
}
